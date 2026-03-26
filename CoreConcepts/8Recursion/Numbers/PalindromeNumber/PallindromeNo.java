package Numbers.PalindromeNumber;

/*
Palindrome number -> reverse of a number = number itself

Reference :
LeetCode - https://leetcode.com/problems/palindrome-number/   - (9)  - solved
GFG - https://www.geeksforgeeks.org/problems/palindrome0746/1  - solved
Hackerrank - https://www.hackerrank.com/challenges/palindrome-index   -  

n=11,  reverse=11(11==11) ,  PallindromeNo
n=13,  reverse=31(31!=13),   not pallindromeNo

//important formula
   n%i 

// Algo 
1.copy number m=n
2.calculate rev of number
  int rev=0;
  while(m>0) rev= rev*10 + (m%10) ; m/=10; 
3.if(rev == n) Pallindrome number 
   else not  Pallindrome number
  
*/

public class PallindromeNo {
    public static void main(String[] args) {
        int n = 121;
        int m=n;

        int rev=0;
        while (m>0) {
            rev= rev*10 + (m%10);
            m /=10;
        }

        if (rev == n) System.out.println("Pallindrome Number");
        else 
            System.out.println("Not Pallindrome Number");
    }
}
