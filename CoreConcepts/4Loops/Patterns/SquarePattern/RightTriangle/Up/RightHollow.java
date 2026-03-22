
public class RightHollow {
    public static void main(String[] args) {
        int n = 5;

        for (int i = n; i >= n; i--) {
            for (int j = 1; j <= n; j++) {
                if (j < i)
                    System.out.print(" ");
                else {
                    if (i == j || i == 1 || j == n)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
