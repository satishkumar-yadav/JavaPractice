package Series.Fibonacci;

public class FibUntilSumExceedsN {
    // fib : 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
    public static void main(String[] args) {
        int a = 0, b = 1;
        int n = 55;

        int sum = 0;
       // while (sum <= n) {   // sum exceed after printing 
        while (sum+a <= n) {   // check before exceeding sum    
            System.out.print(a+" ");
            sum += a;
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("\n Sum of Fibonacci Series Till " + n + " is : " + sum);
    }
}
