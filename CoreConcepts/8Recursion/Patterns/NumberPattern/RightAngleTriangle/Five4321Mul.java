
/*
        j -> col
i v (rows)

        5 * 4 * 3 * 2 * 1
        4 * 3 * 2 * 1
        3 * 2 * 1
        2 * 1
        1

     even(j) -> *
     odd(i) -> i--

   i=5 : j=1
   i=4 : j=1,2
   i=3 : j=1,2,3
   i=2 : j=1,2,3,4
   i=1 : j=1,2,3,4,5 


*/

public class Five4321Mul {
    public static void main(String[] args) {
        int n =5;
        for (int i = n; i >= 1; i--) {
            int p=i;
            for (int j = 1; j <= (2*i-1); j++) {
                if(j % 2 == 0){
                    System.out.print("* ");
                }
                else
                    System.out.print(p-- +" ");
            }
            System.out.println();
            
        }
    }
}
