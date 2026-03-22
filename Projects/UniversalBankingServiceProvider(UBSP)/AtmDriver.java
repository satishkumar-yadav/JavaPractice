import java.util.ArrayList;
import java.util.Scanner;

class Account{   
    // Private fields (Data Hiding)
     private String name;
     private int bal;
     private long accNum;
     private int pin;

    public Account(String name, int bal, long accNum, int pin){
        this.name=name;
        this.bal=bal;
        this.accNum=accNum;
        this.pin=pin;
    }

    // Public Getters & Setters
    public String getName() {
        return name;
    }

    public int getBal() {
        return bal;
    }

    // Controlled update for balance
    public void setBal(int bal) {
        if (bal >= 0)
            this.bal = bal;
    }

    public long getAccNum() {
        return accNum;
    }

    public int getPin() {
        return pin;
    }

    public void display(){
        System.out.println("\n--- Account Info ---");
        System.out.println("Holder Name    : " + name);
        System.out.println("Account Number : " + accNum);
        System.out.println("Bank Name      : " + this.getClass().getSimpleName());
        System.out.println("--------------------\n");
    }
    
    public void checkBalance() {
       System.out.println("Available Balance in " + this.getClass().getSimpleName() + " account is : " + getBal());
    }

    public void changePin(int newPin) {
        if (String.valueOf(newPin).length() == 4) {
            this.pin = newPin;
            System.out.println("Pin updated successfully!");
        } else {
            System.out.println("Error: Pin must be 4 digits.");
        }
    }
 
    public void deposit(int amount) {
        if (amount > 0) {
            setBal(getBal() + amount);
            System.out.println(amount + " deposited successfully to your "+ this.getClass().getSimpleName()+" account.");
        }
    }

}

@FunctionalInterface
interface ATM {
    void withdraw(int amount);
}

class SBI extends Account implements ATM {
    public SBI(String name, int bal, long accNum, int pin){
        super(name, bal, accNum, pin);
    }

    @Override
    public void withdraw(int amount){
        if(amount< getBal()+500){
            setBal(getBal() - amount);
            System.out.println("From Your "+ this.getClass().getSimpleName() + " Bank " + amount + " is withdrawn");
        }
       else {
            System.out.println("Insufficient Balance!");
        }
        checkBalance();
    }
}

class ICICI extends Account implements ATM {
    public ICICI(String name, int bal, long accNum, int pin) {
        super(name, bal, accNum, pin);
    }

    @Override
    public void withdraw(int amount) {
        if (amount <= getBal()+1000) {
            setBal(getBal() - amount);
            System.out.println("From Your " + this.getClass().getSimpleName() + " Bank " + amount + " is withdrawn");
        }
        else {
            System.out.println("Insufficient Balance!");
        }
        checkBalance();
    }
}

class Axis extends Account implements ATM {
    public Axis(String name, int bal, long accNum, int pin) {
        super(name, bal, accNum, pin);
    }

    @Override
    public void withdraw(int amount) {
        if (amount <= getBal()) {
            setBal(getBal() - amount);
            System.out.println("From Your " + this.getClass().getSimpleName() + " Bank " + amount + " is withdrawn");
        } else {
            System.out.println("Insufficient Balance!");
        }
        checkBalance();
    }
}

class BankServer { 
    static ArrayList<Account> database = new ArrayList<>();

    // Static counters to maintain account state
    private static long sbiCounter = 12340000000L;
    private static long iciciCounter = 11110000000L;
    private static long axisCounter = 99990000000L;

    //public static ATM createBankAcc(){
    public static Account createAccount() {    
        Scanner s = new Scanner(System.in);
        System.out.println("\n--- Account Registration ---");
        System.out.print("Enter A/C Holder Name: ");
        String name= s.next();
        System.out.print("Initial Deposit: ");
        int bal=s.nextInt();
        System.out.print("Set 4-digit Pin: ");
        int pin = s.nextInt();
        // System.out.print("Enter 7-digit Base Acc Number: ");
        // long baseNum= s.nextLong();
       
        System.out.println("Choose Bank: \n 1.SBI (1234) \n 2.ICICI (1111) \n 3.Axis (9999)");
        int choice = s.nextInt();
        Account newAcc = null;

        switch (choice) {
            case 1:
                //newAcc = new SBI(name, bal, Long.parseLong("1234" + baseNum), pin);
                newAcc = new SBI(name, bal, ++sbiCounter, pin);
                break;
            case 2:
                newAcc = new ICICI(name, bal, ++iciciCounter, pin);
                break;
            case 3:
                newAcc = new Axis(name, bal, ++axisCounter, pin);
                break;
            default:
                System.out.println("Invalid Selection. Registration Failed.");
               s.close();
               return null;
        }

        if (newAcc != null) { // no need of this check but still kept for safer approach
            database.add(newAcc);
            System.out.println("Success! Account Created, Your" + newAcc.getClass().getSimpleName()
                    + " Account Number is: " + newAcc.getAccNum());
        }
        s.close();
        return newAcc;
    }

    public static Account findAccount(long accNum) {
        for (Account a : database) {
            if (a.getAccNum() == accNum)
                return a;
        }
        return null;
    }
}

class AtmDriver{
   public static void main(String[] args) {
     // ATM a = null;
       Account currentAcc = null;  //
      Scanner s = new Scanner(System.in);

      while (true) {
        // // if (a == null)
          if (currentAcc == null) {
              System.out.println("\n=== Welcome to Universal ATM System ===");
              System.out.print("Enter Account Number (or 0 to Register, -1 to Exit): ");
              long inputAcc = s.nextLong();

              if (inputAcc == -1)
                  break;
              if (inputAcc == 0) {
                 //a = User.createBankAcc();
                      //  acc = User.createBankAcc();
                  BankServer.createAccount();
                  continue;
              }
              
              Account found = BankServer.findAccount(inputAcc);
              if (found == null) {
                  System.out.println("Account not found! Would you like to register? (y/n)");
                  if (s.next().equalsIgnoreCase("y"))
                      BankServer.createAccount();
              } else {
                  System.out.print("Enter Pin for " + inputAcc + ": ");
                  if (s.nextInt() == found.getPin()) {
                      currentAcc = found;
                      System.out.println("Login Successful! Welcome, " + currentAcc.getName());
                  } else {
                      System.out.println("Invalid Pin!");
                  }
              }
          } else {
              System.out.println("\n1.Check Balance 2.Withdraw 3.Deposit 4.Account Info 5.Change Pin 6.Logout");
              int choice = s.nextInt();

              switch (choice) {
                  case 1:
                      currentAcc.checkBalance();
                      break;
                  case 2:
                      System.out.print("Enter Withdrawl Amount: ");
                      ((ATM) currentAcc).withdraw(s.nextInt());
                      break;
                  case 3:
                      System.out.print("Enter Amount to deposit: ");
                      currentAcc.deposit(s.nextInt());
                      break;
                  case 4:
                    //  // ((Account) a).display()
                      currentAcc.display();
                      break;
                  case 5:
                      System.out.print("Enter New Pin: ");
                      currentAcc.changePin(s.nextInt());
                      break;
                  case 6:
                      System.out.println("Logging out " + currentAcc.getName() + "...");
                      currentAcc = null;
                      System.out.println("Thank you for using our services!");
                      System.out.println("Logged out successfully.");
                      break;
                  default:
                      System.out.println("Invalid Option.");
              }
          }
          
      }
   
    }
}


// Universal Banking Service Provider (UBSP)