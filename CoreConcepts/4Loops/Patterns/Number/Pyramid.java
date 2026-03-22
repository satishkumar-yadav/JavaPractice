
public class Pyramid {
    public static void main(String[] args) {
        int n = 5;
        int space = n - 1;
        int star = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            int p = 0;
            for (int k = 1; k <= star; k++) {
                if (k <= i) {
                    System.out.print(k);
                    p = k;
                } else
                    System.out.print(--p);
            }
            System.out.println();
            space--;
            star += 2;

        }
    }
}
