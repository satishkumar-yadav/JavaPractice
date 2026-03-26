
/*
        j -> col
i v (rows)

        2
        4 4
        6 6 6 6
        8 8 8 8 8
         
   i=1 : j=1
   i=2 : j=1,2
   i=3 : skip
   i=4 : j=1,2,3,4
   i=5 : j=1,2,3,4,5 


*/

public class Two468 {
    public static void main(String[] args) {
        int n = 5;

        // M-I
        int num=2;
        for (int i = 1; i <= n; i++) {
            if (i == 3)
                continue;
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+num+" ");
            }
            System.out.println();
            num +=2;
        }

    }      
}
