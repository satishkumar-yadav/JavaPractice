
import java.util.Scanner;

class AutomorphicNumInRange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            int n = i;
            int sq = n * n;
            boolean flag = true;
            while (n > 0) {
                if ((n % 10) != (sq % 10)) {
                    flag = false;
                    break;
                }
                n /= 10;
                sq /= 10;
            }
            if (flag)
                System.out.println(i + " ");

        }

    }
}