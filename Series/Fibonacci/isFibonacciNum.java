package Series.Fibonacci;

/*
Check if a number is Fibonacci in O(1)

Concept - A number is fibonacci if one of these (5*n^2+4) or (5 * n^2 -4) is a perfect square - mathematical property of fibonacci number.
 5 N^2+4   or 5 N^2 - 4

Algo:
1.calculate x= 5*n*n+4
2.calculate y= 5*n*n-4
3.if x or y is perfect square -> fibonacci number 

*/

public class isFibonacciNum {

    static boolean isPerfectSquare(int num){
        int x =(int) Math.sqrt(num);
        //double x = Math.sqrt(num);  //here x*x = num , as it is double value in decimal
       // System.out.println("num : "+num+" , x : "+x+" , x*x : "+x*x+" , x*x==num : "+(x*x == num));

        return x*x==num;
    }

    static boolean isFibonacci(int n){
        return isPerfectSquare(5*n*n+4) || isPerfectSquare(5*n*n-4);
    }
    public static void main(String[] args) {
        int n=21;

        if(isFibonacci(n)) System.out.println("Fibonacci Number");
        else System.out.println("Not Fibonacci Number");
    }
}
