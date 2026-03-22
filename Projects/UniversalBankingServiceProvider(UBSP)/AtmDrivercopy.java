import java.util.ArrayList;
import java.util.Scanner;

class Account{   
    String name;
    int bal;
    long accNum;
    int pin;

    public Account(String name, int bal, long accNum, int pin){
        this.name=name;
        this.bal=bal;
        this.accNum=accNum;
        this.pin=pin;
    }

    public void display(){
        System.out.println("\n--- Account Info ---");
        System.out.println("Holder Name    : " + name);
        System.out.println("Account Number : " + accNum);
        System.out.println("Bank Name      : " + this.getClass().getSimpleName());
        System.out.println("--------------------\n");
       // System.out.println("Account Bal : " + bal);
       // System.out.println("Account Pin : " + pin);

    /////////////////
    
    public void checkBalance() {
        // System.out.println("Current Balance: " + bal);
        System.out.println("Available Balance in " + this.getClass().getSimpleName() + " account is : " + bal);
    }

    public void changePin(int newPin) {
        this.pin = newPin;
        System.out.println("Pin updated successfully!");
    }

    public void changePin(int oldPin, int newPin) {
        if (this.pin == oldPin) {
            this.pin = newPin;
            System.out.println("Pin changed successfully!");
        } 
        else {
            System.out.println("Incorrect old pin.");
        }
    }

    public void deposit(int amount) {
        if (amount > 0) {
            bal += amount;
            System.out.println(amount + " deposited successfully to your "+ this.getClass().getSimpleName()+" Bank.");
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
        if(amount<bal){
            bal -=amount;
            System.out.println("From Your "+ this.getClass().getSimpleName() + " Bank " + amount + " is withdrawn");
        }
       else {
            System.out.println("Insufficient Balance!");
        }
        checkBalance();
       // System.out.println("Your " + this.getClass().getSimpleName() + " Bank Available Balance is " + bal );
    }
}

class ICICI extends Account implements ATM {
    public ICICI(String name, int bal, long accNum, int pin) {
        super(name, bal, accNum, pin);
    }

    @Override
    public void withdraw(int amount) {
        if (amount <= bal) {
            bal -= amount;
            System.out.println("From Your " + this.getClass().getSimpleName() + " Bank " + amount + " is withdrawn");
        }
        else {
            System.out.println("Insufficient Balance!");
        }
        checkBalance();
       // System.out.println("Your " + this.getClass().getSimpleName() + " Bank Available Balance is " + bal);
    }
}

class Axis extends Account implements ATM {
    public Axis(String name, int bal, long accNum, int pin) {
        super(name, bal, accNum, pin);
    }

    @Override
    public void withdraw(int amount) {
       
            bal -= amount;
            System.out.println("From Your " + this.getClass().getSimpleName() + " Bank " + amount + " is withdrawn");
        
        System.out.println("Your " + this.getClass().getSimpleName() + " Bank Available Balance is " + bal);
    }
}

class User { 
    static ArrayList<Account> database = new ArrayList<>();

    //public static ATM createBankAcc(){
    public static Account createBankAcc() {    
        Scanner s = new Scanner(System.in);
        System.out.print("Enter A/C Holder Name: ");
        String name= s.next();
        System.out.print("Initial Deposit: ");
        int bal=s.nextInt();
        System.out.print("Set 11 Digit Account Number: ");
        long accNum= s.nextLong();
        System.out.print("Set 4-digit Pin: ");
        int pin=s.nextInt();

        System.out.println("Select Bank: 1.SBI \n 2.ICICI \n 3.Axis \n 4.None");
        int choice = s.nextInt();

        switch (choice) {
            case 1:
                System.out.println("SBI - Account is Created.");
                return new SBI(name, bal, accNum, pin);
            case 2:
                System.out.println("ICICI - Account is Created.");
                return new ICICI(name, bal, accNum, pin);
            case 3:
                System.out.println("Axis - Account is Created.");
                return new Axis(name, bal, accNum, pin);
            default:
                System.out.println("Invalid Input");
                return null;
        }

    }
}

class AtmDriver{
   public static void main(String[] args) throws Exception {
     // ATM a = null;
       Account acc = null;  //
      Scanner s = new Scanner(System.in);
      System.out.println("=== Welcome to the Universal ATM System ===");

      while (true) {
          System.out.println("\n1.Create/View Account Info  2.Withdraw  3.Deposit  4.Check Balance  5.Change Pin  6.Exit");
          int choice = s.nextInt();

          if (choice == 6){
             // System.out.println("Thank You.");
              break;

          }
             
          //if (a == null && choice != 1) {  
          if (acc == null && choice != 1) {  
              System.out.println("Please create an account first (Option 1).");
              continue;
          }

          switch (choice) {
              case 1:
                  if (acc == null)   
                  // if (a == null)
                  {
                    System.out.println("Create an Account. - true/false");
                    boolean res = s.nextBoolean();
                    if (res) {
                        //a = User.createBankAcc();
                        acc = User.createBankAcc();
                    } else {
                        System.out.println("Account not Created.");
                        //return;
                        break;
                    }
                      }
                  else
                  {
                    System.out.println("Create a new Account ? - true/false");
                    boolean res = s.nextBoolean();
                    if (res) {
                        // a = User.createBankAcc();
                         acc = User.createBankAcc();
                    }
                    else {
                        // ((Account) a).display()
                        acc.display();
                    }
                  }
                  break;

              case 2:
                  System.out.print("Enter Pin: ");
                  if (s.nextInt() == acc.pin) {
                      System.out.print("Enter amount: ");
                      ((ATM) acc).withdraw(s.nextInt());
                  } else
                      System.out.println("Wrong Pin!");

                //   if (a instanceof SBI) {
                //       SBI sbi = (SBI) a;
                //       System.out.println("Enter pin");
                //       int upin = s.nextInt();
                //       if (upin == sbi.pin) {
                //           System.out.println("Enter amount to Withdraw");
                //           a.withdraw(s.nextInt());
                //       }
                //   }
                //   if (a instanceof ICICI) {
                //       ICICI icici = (ICICI) a;
                //       System.out.println("Enter pin");
                //       int upin = s.nextInt();
                //       if (upin == icici.pin) {
                //           System.out.println("Enter amount to Withdraw");
                //           a.withdraw(s.nextInt());
                //       }
                //   }
                //   if (a instanceof Axis) {
                //       Axis axis = (Axis) a;
                //       System.out.println("Enter pin");
                //       int upin = s.nextInt();
                //       if (upin == axis.pin) {
                //           System.out.println("Enter amount to Withdraw");
                //           a.withdraw(s.nextInt());
                //       }
                //   }
                 break;

              case 3:
                  System.out.print("Enter amount to deposit: ");
                  acc.deposit(s.nextInt());
                  break;


              case 4:
                //   if (a instanceof SBI) {
                //       SBI sbi = (SBI) a;
                //       System.out.println("Your SBI Bank Available Balance is : " + sbi.bal);
                //   } else if (a instanceof ICICI) {
                //       ICICI icici = (ICICI) a;
                //       System.out.println("Your ICICI Bank Available Balance is : " + icici.bal);
                //   } else if (a instanceof Axis) {
                //       Axis axis = (Axis) a;
                //       System.out.println("Your Axis Bank Available Balance is : " + axis.bal);
                //   }
                  acc.checkBalance();
                  break;

              case 5:
                  System.out.print("Enter Old Pin: ");
                  int op = s.nextInt();
                  if (op == acc.pin) {
                      System.out.print("Enter New Pin: ");
                      int np = s.nextInt();
                      acc.changePin(op, np);
                  } else
                      System.out.println("Wrong old Pin!");
                  break;
                 
              default:
                  System.out.println("Invalid Choice.");
          }
      }
      System.out.println("Thank you for using our services!");

   
    }
}


// Universal Banking Service Provider (UBSP)