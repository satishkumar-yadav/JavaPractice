package Numbers.EmirpNumber;

/*
Emirp -> reverse of prime number = prime number

Reference :
LeetCode - 
GFG - 
Hackerrank - 

n=13,  reverse=31 - emirp
n=19,  reverse=91(not prime) - not emirp


//important formula
   n%i 

// Algo 
1.flag=true
2.check if n is prime
  for(i=2, i<=root n / i*i<=n) if(n%i == 0) flag=false; break;
  if(flag) prime else not prime
3.calculate reverse
  int rev=0;
  while(n>0) rev=rev*10 + (n%10) ; n/=10; 
4.check rev is prime or not
   repeat step 2 for rev
5.if( isPrime(n) && isPrime(rev)) emirp number 
   else not emirpnumber
  
*/

public class EmirpNo {

    static boolean isPrime(int n){
      boolean flag =true;
      for (int i = 2; i*i <= n; i++) {
          if (n%i == 0) {
             flag= false;
             break;
          }
      }
      return flag;
    }

    static int reverse(int n){
        int rev=0;
        while (n>0) {
            rev= rev*10 + (n%10);
            n /=10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int num = 13;

        if( isPrime(num) && isPrime(reverse(num)) ) System.out.println("number is emirp");
        else System.out.println("number is not emirp");
    }
}
