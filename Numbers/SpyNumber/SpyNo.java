package Numbers.SpyNumber;

/*
SpyNumber -> sum of digit of a number = product of digit of a number

Reference :
LeetCode - 
GFG - 
Hackerrank - 

n=123,  sum of digit = 3+2+1=6 ,  product of digit = 3*2*1=6   - spy number
n=128,  sum of digit = 8+2+1=11 ,  product of digit = 8*2*1=16   - not spy number

important formula
(n%10) 

// Algo 
1.Calculate Sum and product of digit
  int sum=0;  int product =1;
  while(n>0) int digit=n%10 ; sum+=digit; product*=digit; n /=10;
2.check if(sum==product) - SpyNumber  else not SpyNumber

*/

class SpyNo
{
    public static void main(String[] args) {
        int n=123;

        int sum=0 , product=1;
        while(n>0){
            sum += (n%10);
            product *= (n%10);
            n /=10;
        }

        if(sum==product) System.out.println("Spy Number");
        else System.out.println("Not Spy Number");
    }
}