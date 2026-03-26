
/*
        j -> col
i v (rows)

        *
        * *
        *   *
        *     *
        * * * * * 

   // star position
   (1,1)
   (2,1) (2,2)
   (3,1)       (3,3)
   (4,1)             (4,4)
   (5,1) (5,2) (5,3) (5,4) (5,5)

   i=1 : j=1
   i=2 : j=1,2
   i=3 : j=1, ,3
   i=4 : j=1, , ,4
   i=5 : j=1,2,3,4,5 

   logic1 : 
     loop- i=1, i<=n, i++  ;  j=1, j<=i, j++   
     star cond : j==1, i==j, i==n   else space

   logic2 : 
     star = 1
     loop- i=1, i<=n, i++  ;  j=1, j<=star, j++       star++
     star cond : j==1, j==star, i==n   else space
  

   
*/

public class HollowRightTriangle {
    public static void main(String[] args) {
        int n = 5;

        // M-I
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         if(j==1 || i==j || i==n) 
        //             System.out.print(" * ");
        //         else
        //         System.out.print("   ");
        //     }
        //     System.out.println();
        // }

        // M-II
        int st=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= st; j++) {
                if (j == 1 || j == st || i == n)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
            st++;
        }

    }     
}
