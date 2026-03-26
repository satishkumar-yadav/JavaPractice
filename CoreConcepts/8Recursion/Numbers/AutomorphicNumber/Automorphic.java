package Numbers.AutomorphicNumber;

/*
Automorphic -> square of number ends with same number

Reference :
LeetCode - 
GFG - 
Hackerrank - 

n=5,  square=25
square ends with 5

n=25, square=625
square ends with 25

important formula
lastDigit = (n%10) 

// Algo 
1.create flag=true
2.compare digit from last till it is equal , break loop if not equal
  while(n>0) => if( (n%10) != (square%10) ) flag=false; break;    n/=10;  square/=10;
3.check if(flag) - automorphic  


*/

public class Automorphic {
    public static void main(String[] args) {
        int n=25;
        int sq= n*n;

        boolean flag=true;
        while (n>0) {
            if ((n%10) != (sq%10)) {
                flag=false;
                break;
            }
            n/=10;
            sq/=10;
        }

        if (flag)  System.out.println("Automorphic number");
        else 
            System.out.println("Not Automorphic number");
        
    }
}
