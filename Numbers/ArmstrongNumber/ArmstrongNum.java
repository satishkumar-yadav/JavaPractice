
/*
Armstrong -> Sum of power of digits = number

Reference :
LeetCode - https://leetcode.com/problems/armstrong-number/    - 1134  - premium
GFG -  https://www.geeksforgeeks.org/problems/armstrong-numbers2727/0?utm_source=chatgpt.com     - Solved
Hackerrank - https://www.hackerrank.com/topics/armstrong-number  - 

n=153,  digit=3
sum of digit to power digit = 1^3 + 5^3 + 3^3 = 1+125+27 = 153
armstrong if n==sum

//important formula
sum= (n%10)^digit - calculate digit power
n / 10  - remove one digit from end,
n % 10 = get last digit

// Algo 
1.create copy of original number m=n
2.count digit length while(n>0) -> n/=10; digit++  
3.Reset n value to original value n=m  
4.calculate sum of digit to power digit length
  sum=0
  while(n>0) => dg =n%10 ; 
        a.calculate power of digit -> prod=1; for(1 -> digit length) - prod*=dg
        b.calculate sum -> sum+=prod;  n/=10;
5.check if(m==sum) - armstrong  


////////////////////////////////////////////////////////////////////////////
/// 

  Dry Run for recursion
  n     m      sum
  153   153    0
  15    153    0+3^3     n/10
  1     153    27+5^5     n/10
  0     153    152+1^3           n/10

Dry run for pow
n   prod   l
3   1      3    l-- , prod *= n 
3   1*3    2
3   3*3    1
3   9*3    0

Dry Run for length
n     l
153   0
15    1     l++, n/10
1     2
0     3

*/


public class ArmstrongNum {
    static int length;

    static int len(int n, int l){
        if(n==0) return l;
        return len(n/10, l+1);
    }

    static int pow(int n, int prod, int l){
          if(l==0) return prod;
          prod *= n;
        return  pow(n, prod, l-1);
    }

    static boolean isArmstrong(int n, int m, int sum){
        if(n==0) return sum==m;  
       // int l=  len(n, 0);  System.out.println("len : "+l);
        int p = pow(n%10, 1, length); //System.out.println("pow :"+p);
        sum += p;
        //sum += pow(n%10, 1, len(n, 0));
      // sum += Math.pow(n%10, (n+"").length());
        return isArmstrong(n/10, m, sum);
    }

    static boolean isArmstrong(int n) {
        return isArmstrong(n , n, 0);
    }

    static void range(int st, int end){
        if(st>end) return;
        length = (st+"").length(); // System.out.println("St : "+st+" , len : "+length);
        if(isArmstrong(st)) System.out.print(st+" ");
        range(st+1, end);
    }

    public static void main(String[] args) {
        int n = 153, st=10, end=1000;
       // length = (n+"").length();
      
        range(st, end);
       // System.out.println(isArmstrong(n));
    }
}
