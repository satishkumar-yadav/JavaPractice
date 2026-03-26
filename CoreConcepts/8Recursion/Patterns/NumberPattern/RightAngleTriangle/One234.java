/*
        j -> col
i v (rows)

        1
        1 2
        1 2 3 4
        1 2 3 4 5
         
   i=1 : j=1
   i=2 : j=1,2
   i=3 : j=1,2,3
   i=4 : j=1,2,3,4
   i=5 : j=1,2,3,4,5 


*/

public class One234 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
           
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }

    }
}
