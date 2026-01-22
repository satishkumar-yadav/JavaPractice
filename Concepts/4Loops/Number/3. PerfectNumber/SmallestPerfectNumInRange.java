
import java.util.Scanner;

class SmallestPerfectNumInRange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            // int m=i;
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0)
                    sum += j;
            }

            if (i == sum) {
                System.out.print(i + " ");
                break;
            }
        }

    }
}