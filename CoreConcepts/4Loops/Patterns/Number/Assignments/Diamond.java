/*

          j->
   i-v    1  2   3   4   5 

     1-          1
     2-      1   2   1
     3-   1  2   3   2   1 
     4-      1   2   1 
     5-          1

    logic(for pattern): outer loop for row(no of times) -> i = 1 to n ;  
                        condition in inner loop :  int dg =1; int sp= n/2; 
                        inner loop for column(no of times) space ->  j = 1 to j<=sp
                        another inner loop for column(no of times) digit ->  k = 1 to k<=dg
                        if(i<n/2) sp--; dg +=2;
                        else sp++; dg -=2;   

    logic(for printing numbers) :   Mirror Value= totalColumns - currentIndex + 1
                                      
*/

public class Diamond {
    public static void main(String[] args) {
        int n = 5, dg = 1, sp = n / 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) 
                System.out.print("  ");
            for (int k = 1; k <= dg; k++) {
                if(k<= (dg/2)+1)
                    System.out.print(k + " ");
               else    
                   System.out.print((dg - k + 1) + " ");
            }
            System.out.println();
            if (i <= n / 2) {
                sp--;
                dg +=2;
            }
            else{
                sp++;
                dg -=2;
            }
        }
    }
}
