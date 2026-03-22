
public class HollowReversePyramid {
    public static void main(String[] args) {
        int n = 5;
        int space = 0;
        int star = (n * 2) - 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= star; k++) {
                if (k == 1 || k == star || i == 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            space++;
            star -= 2;
        }
    }
}
