import java.util.Scanner;

class SecondHighestPerfectNumInRange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;
        for (int i = end; i >= start; i--) {
            // int m=i;
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0)
                    sum += j;
            }

            if (i == sum) {
                count++;
                if (count == 2) {
                    System.out.print(i + " ");
                    break;
                }
            }
        }

    }
}