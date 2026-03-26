
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


*/


public class ArmstrongNum {
    public static void main(String[] args) {
        int n = 153;
        int m = n;

        //calculate no of digit
        int dg=0;
        while(n>0){
          dg++;
          n /= 10;
        }

       int sum=0;
       n=m;
       while (n>0) {
        int digit = n%10;
        int pow=1;
        for (int j = 1; j <= dg; j++) {
            pow *=digit;
        }
        sum +=pow;

        n /=10;
       }

       if (sum==m) 
           System.out.println(m+" is armstrong");
       else 
           System.out.println(m + " is not armstrong");
      
    }
}
