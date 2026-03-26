package Numbers.HappyNumber;

/*
Happy number -> sum of all factor except number itself = number itself

Reference :
LeetCode - https://leetcode.com/problems/happy-number/   - (202)  - solved
GFG - https://practice.geeksforgeeks.org/problems/happy-number/1  - solved
Hackerrank - https://www.hackerrank.com/topics/happy-number  -  

//important formula
   n%i 

Example 1:

Input: n = 19
Output: true
Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1


A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

 // Algo 
 1.calculate sum of square of digit until sum is single digit
  while(n>0){ 
  sum +=(n%10) * (n%10);  
  n /=10;
  if(n==0 && sum>9) {
      n=sum;
      sum=0;
    }
  }

2.check if sum==1 , happy number if true else not happy number
  
*/

public class HappyNum {
    
    public static void main(String[] args) {
        int n=19;

        int sum=0;
        while (n>0) {
            sum += (n%10) * (n%10);
            n /=10;
            if (n==0 && (sum != 1 && sum != 4)) {
                n=sum;
                sum=0;
            }
        }

        if (sum==1) System.out.println("Happy number"); 
        else 
            System.out.println("Not Happy number");
    }

}
