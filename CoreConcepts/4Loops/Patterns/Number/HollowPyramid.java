public class HollowPyramid {
    public static void main(String[] args) {
        int n = 4;
        int space = n - 1;
        int star = 1;
        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= star; k++) {
                if (k == 1 || i == n || k == star)
                    System.out.print(ch++);
                else
                    System.out.print(" ");

            }
            System.out.println();
            space--;
            star += 2;

        }
    }
}
