
/*
        j -> col  - space, star
i v (rows)

              *    
            * *   
          * * *    
        * * * *    
         
   i=1 : sp=3 - 3,2,1, st=1 - 1
   i=2 : sp=2 - 2,1  , st=2 - 1,2
   i=3 : sp=1 - 1    , st=3 - 1,2,3
   i=4 : sp=0 -      , st=4 - 1,2,3,4

    st=i, sp=n-i
   logic :  i=1, i<=n, i++  ;  j=sp, j>=0, j-- ; j=st, j<=n, j++   

  
*/

public class MirroredRightTriangle {
    public static void main(String[] args) {
        int n = 4;

        // M-I
        // int st=1;
        // int sp=n-st;
        for (int i = 1; i <= n; i++) {
            int st = i;
            int sp = n - i;
            for (int j = sp; j >= 1; j--) {
                System.out.print("   ");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print(" * ");
            }
            System.out.println();
            st++;
            sp--;
        }

    }
}
