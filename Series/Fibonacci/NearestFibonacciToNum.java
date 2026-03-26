package Series.Fibonacci;

/*

 n=30
 fib no : 21 34 
 nearest : (30-21) < (34-30) ? 21 : 34

 Dry Run : 
 n=30
 a=21 , b=34
 (n-a) = 30-21 = 9
 (b-n) = 34-30 = 4

 b-n < n-a = b

 Nearest = 34

*/

public class NearestFibonacciToNum {
    // fib : 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
    static int nearestFib(int n){
        int a = 0, b = 1;

        for (; b <= n; ) {
            int c = a + b; 
            a = b;
            b = c;
        }

        System.out.println("a : "+a+" , b : "+b);
        return ((n-a) < (b-n) ? a : b  ) ;
    }

    public static void main(String[] args) {
        int num= 13 ;
        System.out.println(nearestFib(num));
    }
}
