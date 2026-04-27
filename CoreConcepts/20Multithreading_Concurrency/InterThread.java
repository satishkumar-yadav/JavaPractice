class Bank  {
    int bal;
    public Bank(int bal){this.bal=bal;}

    public synchronized void withdraw(int amount){
        if(amount>bal){
            try {
                System.out.println("Less Bal");
                wait();
            } catch (Exception e) {
                
            }
            
        }
        bal -= amount;
        System.out.println(amount+" Withdrawn Successfully");
        System.out.println("The Available bal is : "+bal);
    }

    public synchronized void deposit(int amount){
        System.out.println("Depositing...");
        bal += amount;
        notify();
        System.out.println("Deposit Successfully");
    }
} 

public class InterThread {

    public static void main(String[] args) {
        Bank b = new Bank(5000);

        new Thread() {
            public void run(){
                b.withdraw(7000);
            }
        }.start();

        new Thread() {
            public void run() {
                b.deposit(10000);
            }
        }.start();
    }
}