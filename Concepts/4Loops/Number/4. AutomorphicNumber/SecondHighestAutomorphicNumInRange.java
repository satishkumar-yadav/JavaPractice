
import java.util.Scanner;

class SecondHighestAutomorphicNumInRange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;
        for (int i = end; i >= start; i--) {
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
            if (flag) {
                count++;
                if (count == 2) {
                    System.out.println(i + " ");
                    break;
                }

            }

        }

    }
}