
/*
        j -> col
i v (rows)

        * * * * *
        *     *
        *   *
        * *      
        *  

   // star position
   (1,1) (1,2) (1,3) (1,4) (1,5)
   (2,1)             (2,4)
   (3,1)       (3,3)
   (4,1) (4,2)             
   (5,1) 

   i=1 : j=1,2,3,4,5
   i=2 : j=1, , ,4 
   i=3 : j=1, ,3
   i=4 : j=1,2
   i=5 : j=1, 

   logic1 : 
     loop- i=1, i<=n, i++  ;  j=1, j<=n+i-1, j++   
     star cond : i==1, j==1, i+j=n+1   else space

     // star position
   (5,1) (5,2) (5,3) (5,4) (5,5)
   (4,1)             (4,4)
   (3,1)       (3,3)
   (2,1) (2,2)             
   (1,1) 

   i=5 : j=1,2,3,4,5
   i=4 : j=1, , ,4 
   i=3 : j=1, ,3
   i=2 : j=1,2
   i=1 : j=1, 

   logic2 : 
     loop- i=n, i>=1, i--  ;  j=1, j<=i, j++   
     star cond : i==n, j==1, i==j,    else space
    
     //  condition for hollow right triangle
    //logic : 
    // loop- i=1, i<=n, i++  ;  j=1, j<=i, j++   
    // star cond : j==1, i==j, i==n   else space   //

     // star position
   (1,5) (1,4) (1,3) (1,2) (1,1)
   (2,5)             (2,2)
   (3,5)       (3,3)
   (4,5) (4,4)             
   (5,5) 

   i=1 : j=5,4,3,2,1
   i=2 : j=5, , ,2 
   i=3 : j=5, ,3
   i=4 : j=5,4
   i=5 : j=5, 

   logic3 : 
     loop- i=1, i<=n, i++  ;  j=n, j>=i, j--   
     star cond : i==1, j==n, i==j   else space

   logic4 : 
     star = n
     loop- i=1, i<=n, i++  ;  j=1, j<=star, j++       star--
     star cond : j==1, j==star, i==1   else space
  

   
*/


public class HollowInvertedRightTriangle {
    public static void main(String[] args) {
        int n = 5;

        // M-I
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n+i-1; j++) {
        // if(i==1 || j==1 || i+j==n+1)
        // System.out.print(" * ");
        // else
        // System.out.print("   ");
        // }
        // System.out.println();
        // }

        // M-II
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // if(i==n || j==1 || i==j)
        // System.out.print(" * ");
        // else
        // System.out.print("   ");
        // }
        // System.out.println();
        // }

         // M-III
        // for (int i = 1; i <= n; i++) {
        // for (int j = n; j >= i; j--) {
        // if(i==1 || j==n || i==j)
        // System.out.print(" * ");
        // else
        // System.out.print("   ");
        // }
        // System.out.println();
        // }

        // M-IV
        int st = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= st; j++) {
                if (j == 1 || j == st || i == 1)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
            st--;
        }

    }
}
