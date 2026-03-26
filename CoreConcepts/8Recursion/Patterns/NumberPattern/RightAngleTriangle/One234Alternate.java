/*
        j -> col
i v (rows)

        1
        3  2
        4  5  6
        10 9  8  7
        11 12 13 14 15

     1  ->   1
     2  ->   3   2
     3  ->   4   5   6
     4  ->   10  9   8   7
     5  ->   11  12  13  14  15
     6  ->   21  20  19  18  17  16 
     7  ->   22  23  24  25  26  27  28
     
     num = 1
     even(i) -> prev+i   separate j loop for printing --prev value
     odd(i) -> prev+(i-1)   separate j loop for printing prev++ value

    // Dry Run 
   prev = 1                                         decr                print            incr 
   i=1 : j=1            i(odd)  -> prev=1+(1-1)=1                       1                prev=2  
   i=2 : j=1,2          i(even) -> prev=2+2=4       prev=3,2            3,2 
   i=3 : j=1,2,3        i(odd)  -> prev=2+(3-1)=4                       4,5,6            prev=5,6,7
   i=4 : j=1,2,3,4      i(even) -> prev=7+4=11      prev=10,9,8,7       10,9,8,7
   i=5 : j=1,2,3,4,5    i(odd)  -> prev=7+(5-1)=11                      11,12,13,14,15   prev=12,13,14,15,16 


*/

public class One234Alternate {
    public static void main(String[] args) {
        int n = 5;
        
        int prev =1;
        for (int i = 1; i <= n; i++) {
                if (i % 2 == 0){
                     prev+=i;
                      for (int j = 1; j <= i; j++) {
                          System.out.print(" " + --prev + " ");
                      }
                   
                } 
                else{
                     prev += i-1;
                     for (int j = 1; j <= i; j++) {
                         System.out.print(" " + prev++ + " ");
                     }
                }
                    
            
            System.out.println();
        }

    }
}
