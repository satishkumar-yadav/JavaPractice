
public class LeftHollow {
    public static void main(String[] args) {
        int n = 5;

        // M-I
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // if (j == 1 || i == n || i == j)
        // System.out.print("*");
        // else
        // System.out.print(" ");

        // }
        // System.out.println();
        // }

        // M-II
        int star = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= star; j++) {
                if (j == 1 || i == n || j == star)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
            star++;
        }

    }
}
