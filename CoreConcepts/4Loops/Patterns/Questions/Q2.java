//  horizontal sanddune

public class Q2 {
    public static void main(String[] args) {
        
         int n = 7;
        int sp = 0;
        int st = n;

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= sp; k++) {
                System.out.print("*");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= sp; k++) {
                System.out.print("*");
            }
            System.out.println();
            // if ((i%2)==0 && i < (n / 2)) {
            //     sp++;
            //     st -= 2;
            // } 
            // else if ((i%2) !=0 && i <= (n / 2)) {
            //     sp++;
            //     st -= 2;
            // } 

            if (i <= (n / 2)) {
                sp++;
                st -= 2;
            } 
            else {
                sp--;
                st += 2;
            }
        }

 

        
       
    }
}
