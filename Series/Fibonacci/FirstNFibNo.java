package Series.Fibonacci;

/*
Fibonacci Series - starts from 0 , sum of prev 2 num = next number in series

Algo
1.initialize two variable with 0 and 1 :  a=0, b=1
2.print this a and b 
3.calculate c=a+b; print(c); re-initialize a & b value, a=b; b=c   inside loop


*/


public class FirstNFibNo {
    public static void main(String[] args) {
         int a=0, b=1; int noOfTerms=15;

    // M - I     
    // System.out.print(a+" "+b+" ");
    // for(int i=1; i<= noOfTerms;i++) {
    //     int c=a+b;
    //     a=b;
    //     b=c;
    //     System.out.print(c+" ");
    // }

    // M - II
    // optimised - best for interviews
    for (int i = 1; i <= noOfTerms; i++) {
        System.out.print(a + " ");
        int next = a + b;
        a = b;
        b = next;
    }

    }
   
}
