
public class RightPascalTriangle {
    public static void main(String[] args) {
        int n = 10;
        // int space = n - 1;
        int star = 1;

        for (int i = 1; i <= n; i++) {
            // for (int j = 1; j <= space; j++) {
            // System.out.print(" ");
            // }
            for (int k = 1; k <= star; k++) {
                System.out.print("*");
            }
            System.out.println();
            // space--;
            if (((n % 2) == 0) && (i < n / 2))
                star += 1;
            else if (n % 2 != 0 && i <= n / 2)
                star += 1;
            else
                star--;
        }
    }
}
