package Numbers.NeonNumber;

/*
Neon number -> Sum of digits of square of a number = number itself

Reference :
LeetCode - 
GFG - 
Hackerrank - 

n=9,  square=81 ,  sum of digits of square = 8+1=9(9==9)  - neon number
n=8,  square=64 ,  sum of digits of square = 6+4=10(10!=8)  - not neon number

//important formula
   n%i 

// Algo 
1.square number,  sq=n*n;
2.calculate sum of digits of square
  int sum=0;
  while(sq>0) sum+=(sq%10) ; sq/=10; 
3.if(sum == n) neon number 
   else not  neon number
  
*/

public class NeonNo {
    public static void main(String[] args) {
        int n= 9;
        int sq= n*n;

        int sum=0;
        while (sq>0) {
            sum += (sq%10);
            sq /=10;
        }

        if (sum == n) System.out.println("Neon Number");
        else     
            System.out.println("Not Neon Number");
        
    }
}
