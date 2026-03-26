/*
        j -> col
i v (rows)

        *
        * *
        * * *
        * * * *
         
   i=1 : j=1
   i=2 : j=1,2
   i=3 : j=1,2,3
   i=4 : j=1,2,3,4 

   logic1 :  i=1, i<=n, i++  ;  j=1, j<=i, j++   

   i=1 : j=1         (star=1)
   i=2 : j=1,2       (star=2)
   i=3 : j=1,2,3     (star=3)
   i=4 : j=1,2,3,4   (star=4)

   star=1
   logic2 :  i=1, i<=n, i++  ;  j=1, j<=star, j++        star++

   i=1 : j=1
   i=2 : j=2,1
   i=3 : j=3,2,1
   i=4 : j=4,3,2,1

   logic3 :  i=1, i<=n, i++  ;  j=i, j>=1, j--        

   i=1 : j=4         (4-1+1)
   i=2 : j=4,3       (4-2+1)
   i=3 : j=4,3,2     (4-3+1)
   i=4 : j=4,3,2,1   (4-4+1) 

   logic4 :  i=1, i<=n, i++  ;  j=n, j>n-i+1, j--

*/

public class RightAnglesTriangle {
    public static void main(String[] args) {
        int n = 4;

        // M-I
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // M-II
        // int st = 1;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= st; j++) {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        //     st++;
        // }

        // M-III
        // for (int i = 1; i <= n; i++) {
        //     for (int j = i; j >= 1; j--) {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        // M-IV
        // for (int i = 1; i <= n; i++) {
        //     for (int j = n; j >= n-i+1; j--) {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

    }
}
