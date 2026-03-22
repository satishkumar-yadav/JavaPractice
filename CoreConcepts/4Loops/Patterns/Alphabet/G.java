
public class G {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int k = (n / 2); k <= n; k++) {
                if (i == (n / 2) + 1 || k == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
