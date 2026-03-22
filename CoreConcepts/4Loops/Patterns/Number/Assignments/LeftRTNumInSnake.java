
/*

          j->
   i-v    1  2   3   4   5 

     1-   1  
     2-   3  2 
     3-   4  5   6  
     4-   10 9   8   7 
     5-   11 12  13  14   15

    logic(for pattern): outer loop for row(no of times) -> i = 1 to n ;
                        inner loop for column(no of times) data ->  j = 1 to j<=i  

    logic(for printing numbers) :   prev=1;
                                    even(i) -> prev + i;
                                    odd(i)  -> prev + (i-1); 

*/

class LeftRTNumInSnake {
    public static void main(String[] args) {
        int n = 5; int k=1;
        for (int i = 1; i <= n; i++) 
        {
            if(i % 2 == 0)
            {
                k += i;

                for (int j = 1; j <= i; j++)
                    System.out.print(--k + "\t");
            }
            else 
            {
                k += i-1;

                for (int j = 1; j <= i; j++)
                    System.out.print(k++ + "\t");
            }
           
            System.out.println(); 
            
        }
    }
}
