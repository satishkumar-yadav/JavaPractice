import java.util.ArrayList;
import java.util.Scanner;

class Account {
    private String name;
    private int bal;
    private long accNum;
    private int pin;
    public Account(String name, int bal, long accNum, int pin) {
        this.name = name;
        this.bal = bal;
        this.accNum = accNum;
        this.pin = pin;
    }
    public String getName() { return name; }
    public int getBal() { return bal; }
    public long getAccNum() { return accNum; }
    public int getPin() { return pin; }


    public void setBal(int bal) { 
        // Update global bank liquidity when individual balance changes
        BankServer.updateLiquidity(bal - this.bal);
        this.bal = bal; 
    }
    

    public void display() {
        System.out.println("\n--- Account Info ---");
        System.out.println("Holder Name    : " + name);
        System.out.println("Account Number : " + accNum);
        System.out.println("Bank Name      : " + this.getClass().getSimpleName());
        System.out.println("Current Balance: " + bal);
        System.out.println("--------------------\n");
    }
    public void checkBalance() {
        System.out.println("Available Balance in " + this.getClass().getSimpleName() + ": " + getBal());
    }
    public void changePin(int newPin) {
        if (String.valueOf(newPin).length() == 4) {
            this.pin = newPin;
            System.out.println("Pin updated successfully!");
        } else System.out.println("Error: Pin must be 4 digits.");
    }
    public void deposit(int amount) {
        if (amount > 0) {
            setBal(getBal() + amount);
            System.out.println(amount + " deposited successfully.");
        }
    }
}
@FunctionalInterface
interface ATM {
    void withdraw(int amount);
}
class SBI extends Account implements ATM {
    public SBI(String name, int bal, long accNum, int pin) { super(name, bal, accNum, pin); }
    @Override
    public void withdraw(int amount) {
        if (amount <= getBal() + 500) {
            setBal(getBal() - amount);
            System.out.println("Withdrawn " + amount + " from SBI.");
        } else System.out.println("Insufficient Funds!");
    }
}
class ICICI extends Account implements ATM {
    public ICICI(String name, int bal, long accNum, int pin) { super(name, bal, accNum, pin); }
    @Override
    public void withdraw(int amount) {
        if (amount <= getBal() + 1000) {
            setBal(getBal() - amount);
            System.out.println("Withdrawn " + amount + " from ICICI.");
        } else System.out.println("Insufficient Funds!");
    }
}
class Axis extends Account implements ATM {
    public Axis(String name, int bal, long accNum, int pin) { super(name, bal, accNum, pin); }
    @Override
    public void withdraw(int amount) {
        if (amount <= getBal()) {
            setBal(getBal() - amount);
            System.out.println("Withdrawn " + amount + " from Axis.");
        } else System.out.println("Insufficient Balance!");
    }
}



class BankServer {
    static ArrayList<Account> database = new ArrayList<>();
    private static long sbiCounter = 12340000000L, iciciCounter = 11110000000L, axisCounter = 99990000000L;
    private static int totalSbi = 0, totalIcici = 0, totalAxis = 0;
    private static long globalLiquidity = 0;

    public static void updateLiquidity(int change) { globalLiquidity += change; }

    public static Account createAccount() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Name: "); String name = s.next();
        System.out.print("Initial Deposit: "); int bal = s.nextInt();
        System.out.print("Set 4-digit Pin: "); int pin = s.nextInt();

        System.out.println("Choose Bank: 1.SBI 2.ICICI 3.Axis");
        int choice = s.nextInt();
        Account newAcc = null;

        switch (choice) {
            case 1: newAcc = new SBI(name, 0, ++sbiCounter, pin); totalSbi++; break;
            case 2: newAcc = new ICICI(name, 0, ++iciciCounter, pin); totalIcici++; break;
            case 3: newAcc = new Axis(name, 0, ++axisCounter, pin); totalAxis++; break;
            default: return null;
        }

        database.add(newAcc);
        newAcc.setBal(bal); // This also updates global liquidity
        System.out.println("Account Created! Number: " + newAcc.getAccNum());
        return newAcc;
    }

    public static void showAdminPanel() {
        System.out.println("\n========= SYSTEM ADMIN PANEL =========");
        System.out.println("Total SBI Accounts   : " + totalSbi);
        System.out.println("Total ICICI Accounts : " + totalIcici);
        System.out.println("Total Axis Accounts  : " + totalAxis);
        System.out.println("Total Active Users   : " + database.size());
        System.out.println("Total Bank Liquidity : ₹" + globalLiquidity);
        System.out.println("======================================");
    }

    public static Account findAccount(long accNum) {
        for (Account a : database) if (a.getAccNum() == accNum) return a;
        return null;
    }
}

class AtmDriver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Account currentAcc = null;

        while (true) {
            if (currentAcc == null) {
                System.out.println("\n=== Universal ATM Main Menu ===");
                System.out.print("Acc Number (0:Register, -1:Exit, -99:Admin): ");
                long input = s.nextLong();

                if (input == -1) break;
                if (input == -99) { BankServer.showAdminPanel(); continue; }
                if (input == 0) { BankServer.createAccount(); continue; }

                Account found = BankServer.findAccount(input);
                if (found != null) {
                    System.out.print("Enter Pin: ");
                    if (s.nextInt() == found.getPin()) currentAcc = found;
                    else System.out.println("Wrong Pin.");
                } else System.out.println("Not Found.");
            } else {
                System.out.println("\n1.Balance 2.Withdraw 3.Deposit 4.Info 5.Pin 6.Logout");
                int c = s.nextInt();
                switch (c) {
                    case 1: currentAcc.checkBalance(); break;
                    case 2: System.out.print("Amount: "); ((ATM)currentAcc).withdraw(s.nextInt()); break;
                    case 3: System.out.print("Amount: "); currentAcc.deposit(s.nextInt()); break;
                    case 4: currentAcc.display(); break;
                    case 5: System.out.print("New Pin: "); currentAcc.changePin(s.nextInt()); break;
                    case 6: currentAcc = null; break;
                }
            }
        }
    }
}