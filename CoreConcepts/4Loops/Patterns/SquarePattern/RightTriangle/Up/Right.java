
public class Right {
    public static void main(String[] args) {
        int n = 5;

        // M-I
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (j < i)
                    System.out.print(" ");
                else
                    System.out.print("*");

            }
            System.out.println();
        }

        // M-II -- needs checking
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - 1; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // M-III
        // int star = 1;
        // int space = n - 1;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= space; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= star; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // star++;
        // space--;
        // }

    }
}
