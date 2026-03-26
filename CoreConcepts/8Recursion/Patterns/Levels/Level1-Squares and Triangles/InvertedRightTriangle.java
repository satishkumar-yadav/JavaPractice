
/*
        j -> col
i v (rows)

        * * * *
        * * *
        * * 
        * 
         
   i=1 : j=4,3,2,1
   i=2 : j=4,3,2
   i=3 : j=4,3
   i=4 : j=4

   logic1 :  i=1, i<=n, i++  ;  j=n, j>=i, j--   

   i=1 : j=1,2,3,4  (4-1+1)
   i=2 : j=1,2,3    (4-2+1)
   i=3 : j=1,2      (4-3+1)
   i=4 : j=1        (4-4+1)

   logic2 :  i=1, i<=n, i++  ;  j=1, j <= n-i+1 , j++

   or 
   i=4 : j=1,2,3,4
   i=3 : j=1,2,3
   i=2 : j=1,2
   i=1 : j=1 
  
   logic3 : i=n,i>=1,i-- ;  j=1,j<=i,j++

    logic4 : i=n,i>=1,i-- ;  j=1,j<=n,j++  if(j<=i) * else space
    logic5 : i=1,i<=n,i++ ;  j=i,j<=n,j++

*/

public class InvertedRightTriangle {
    public static void main(String[] args) {
        int n = 5;

        // M-I
        // for (int i = 1; i <= n; i++) {
        //     for (int j = n; j >= i; j--) {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        // M-II
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n-i+1; j++) {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        // M-III
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        // M-Iv
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= n; j++) {
        //     if(j<=i) 
        //         System.out.print(" * ");
        //     else 
        //         System.out.print("  ");
        
        // }
        // System.out.println();
        // }

        // M-v
        for (int i = 1; i <= n; i++) {
        for (int j = i; j <= n; j++) {
        System.out.print(" * ");
        }
        System.out.println();
        }

    }
}
