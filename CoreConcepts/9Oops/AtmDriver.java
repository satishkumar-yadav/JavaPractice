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
        System.out.println("User Name : "+name);
        System.out.println("Account Bal : " + bal);
        System.out.println("Account Number : "+accNum);
        System.out.println("Account Pin : " + pin);
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
        System.out.println("Your " + this.getClass().getSimpleName() + " Bank Available Balance is " + bal );
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
        System.out.println("Your " + this.getClass().getSimpleName() + " Bank Available Balance is " + bal);
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
    public static ATM createBankAcc(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your name, bal, AccNum, pin");
        String name= s.next();
        int bal=s.nextInt(0);
        long accNum= s.nextLong();
        int pin=s.nextInt();

        
    }
}