package Series.Fibonacci;

/*
Reference: 
Leetcode - https://leetcode.com/problems/fibonacci-number/  - (509) - solved
GFG - https://practice.geeksforgeeks.org/problems/nth-fibonacci-number1335/1 - solved
Hackerrank - https://www.hackerrank.com/challenges/recursion-fibonacci-numbers - 


normal recursion - O(2^n)
DP - O(n)

Matrix Exponentiation - best approach  - O(log n)

Formula :          []^n
[1  1   ^n
 1  0 ]


 Dry Run (n=7) : 
0   1
1   1
1   2
2   3   
3   5
5   8   
8   13

Ans : 13

*/

public class NthFibonacci {

    static int fib(int n){
        int a=0, b=1;

        if(n==0) return a;

        for (int i = 2; i <= n; i++) {
            int c= a+b;
            a=b;
            b=c;
        }

        return b;
    }

    public static void main(String[] args) {
        int n=7;
        System.out.println(fib(n));
    }
}
