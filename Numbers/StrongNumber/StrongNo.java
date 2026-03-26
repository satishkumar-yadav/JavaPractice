package Numbers.StrongNumber;

/*
Strong Number -> sum of factorial of each digit of a number = number itself

Reference :
LeetCode - 
GFG - 
Hackerrank - 

n=145,  sum of factorial of each digit = 5! + 4! + 1! = 120+24+1=145(145==145)  , Strong number
n=143,  sum of factorial of each digit = 3! + 4! + 1! = 6+24+1=31(31==145)  , Strong number

important formula
(n%10) 

// Algo 
1.Copy number m=n;
2.Calculate Sum of factorial of each digit
  int sum=0;
  while(n>0) 
    int digit=n%10 ;  
    int fact=1;
    for(i=1; i<= digit; i++) fact *=digit;
    sum += fact;
    n /=10;
3.check if(sum==n) - Strong Number  else not Strong Number

*/

public class StrongNo {
    public static void main(String[] args) {
        int n=145;
        int m=n;

        int sum=0;
        while (m>0) {
            int digit = m%10;
            int fact=1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            m /=10;
        }

        if (sum == n) System.out.println("Strong Number");
        else System.out.println("Not Strong Number");
    }
}
