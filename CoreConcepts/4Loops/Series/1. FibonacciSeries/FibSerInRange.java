
import java.util.Scanner;

class FibSerInRange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range: ");
        int n = sc.nextInt();
        sc.close();
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");

        for (;;) {
            int c = a + b;
            if (c > n)
                break;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }
}