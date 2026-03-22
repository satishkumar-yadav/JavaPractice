import java.util.Scanner;

public class StrongNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int m = n;

        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            int prod = 1;
            for (int i = 1; i <= d; i++) {
                prod *= i;
            }
            sum += prod;
            n /= 10;
        }
        if (sum == m)
            System.out.println("Strong Number ");
        else
            System.out.println("Not Strong Number ");

    }
}