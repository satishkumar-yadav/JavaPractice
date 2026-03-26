package Numbers.PerfectNumber;

/*
Perfect number -> sum of all factor except number itself = number itself

Divisor: A divisor of a number is any integer that can divide that number without leaving a remainder.Divisors can include both positive and negative integers. For example, divisors of 12 are 1,2,3,4,6,12,−1,−2,−3,−4,−6,−12.

Factor: A factor of a number is a specific type of divisor that, when multiplied by another integer, produces the original number.  Factors are typically considered in the context of multiplication and are usually positive integers.For example, in the multiplication 3×4=12, both 3 and 4 are factor of 12.  For 12, factore are 1,2,3,4,6,12.  no -ve number.

Reference :
LeetCode - https://leetcode.com/problems/perfect-number/   - (507)  - solved
GFG - https://practice.geeksforgeeks.org/problems/perfect-numbers3207/1  - solved
Hackerrank - https://www.hackerrank.com/contests/projecteuler/challenges/euler023   -  

n=6,  sum of factor = 1+2+3 = 6(6==6) ,  PerfectNo
n=12,  sum of factor = 1+2+3+4+6=16(16!=12),   not PerfectNo

//important formula
   n%i 

// Algo 
1.find factor and add to sum
  for(i=2-n/2) if(n%i==0) sum+=i
2.check if sum==n, peerfect no if true ,else not perfect no

  
*/

public class PerfectNo {

    static boolean isPerfect1(int num){
          if (num < 6)
            return false;
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    //Efficient method - saves time
    static boolean isPerfect(int num) {
        if (num < 6)
            return false;
        int sum = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) {
                    sum += num / i;
                }
            }
        }
        return sum - num == num;
    }

    public static void main(String[] args) {
        int n=6;
       
        if (isPerfect(n)) System.out.println("Perfect Number");
        else 
            System.out.println("Not Perfect Number");
    }
}
