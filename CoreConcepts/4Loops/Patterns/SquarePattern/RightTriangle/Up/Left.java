
public class Left {
    public static void main(String[] args) {
        int n = 5;

        // M-I
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");

        // }
        // System.out.println();
        // }

        // M-II
        // int star = 1;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= star; j++) {
        // System.out.print("*");

        // }
        // System.out.println();
        // star++;
        // }

        // M-III

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= n - i + 1; j--) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
}
