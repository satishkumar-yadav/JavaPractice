package Numbers.PrimeNumber;

/*
PrimeNo -> starts from 2, has only 2 factor(1 and itself) 

Reference :
LeetCode - 
GFG - 
Hackerrank - 

n=5,  factor=1,5   ,  Prime

n=6, factor=1,2,6(2 extra factor) , Not Prime

important formula
(n%10) 

// Algo 
1.create flag=true
2.Divide No with all possible value of factor(2-n/2) only if n>=2  else make flag false
  for(i=2; i<=n/2; i++) if(n%i==0) flag=false; break;
3.check if(flag) - Prime  else not prime


*/

public class PrimeNo {
    public static void main(String[] args) {
        int n=1;

        boolean flag = true;
        if (n >= 2) {  // saves time complexity
          for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
              flag = false;
              break;
            }
          }
        }
        else flag=false;
      
        if (flag) System.out.println("Prime Number");
        else 
          System.out.println("Not Prime Number");
    }
}
