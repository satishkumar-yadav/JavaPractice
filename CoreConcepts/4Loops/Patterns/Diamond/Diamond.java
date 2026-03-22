
public class Diamond {
    public static void main(String[] args) {
        int n = 11;
        int sp = n / 2;
        int st = 1;

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= sp; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (n % 2 == 0 && i < n / 2) {
                sp--;
                st += 2;
            } else if (n % 2 != 0 && i <= n / 2) {
                sp--;
                st += 2;
            } else {
                sp++;
                st -= 2;
            }
        }
    }
}
