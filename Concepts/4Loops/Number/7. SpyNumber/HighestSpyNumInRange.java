import java.util.Scanner;

public class HighestSpyNumInRange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = end; i >= start; i--) {
            int n = i;
            int sum = 0;
            int prod = 1;
            while (n > 0) {
                int r = n % 10;
                sum += r;
                prod *= r;
                n /= 10;
            }
            if (sum == prod) {
                System.out.print(i + " ");
                break;
            }

        }
    }
}