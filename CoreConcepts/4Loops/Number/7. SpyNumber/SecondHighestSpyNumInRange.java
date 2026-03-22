import java.util.Scanner;

public class SecondHighestSpyNumInRange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;
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
                count++;
                if (count == 2) {
                    System.out.print(i + " ");
                    break;
                }

            }

        }
    }
}