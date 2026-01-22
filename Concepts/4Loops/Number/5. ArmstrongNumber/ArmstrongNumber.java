import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int m = n;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }

        int sum = 0;
        n = m;
        while (n > 0) {
            int d = n % 10;
            int prod = 1;
            for (int i = 1; i <= count; i++) {
                prod *= d;
            }
            sum += prod;
            n /= 10;
        }
        if (sum == m)
            System.out.println("Armstrong Number ");
        else
            System.out.println("Not Armstrong Number ");

    }
}