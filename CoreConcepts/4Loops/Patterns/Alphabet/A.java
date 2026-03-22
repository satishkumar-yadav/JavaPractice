
public class A {
    public static void main(String[] args) {
        int n = 5;

        // M-I
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == n || j == 1 || i == (n / 2) + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // M-II
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {

        // }
        // System.out.println();
        // }
    }
}
