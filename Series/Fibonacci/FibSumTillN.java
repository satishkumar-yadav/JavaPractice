package Series.Fibonacci;

public class FibSumTillN {
    // fib : 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
    public static void main(String[] args) {
        int a = 0, b = 1;
        int n = 13;

        int sum=0;
        while (a <= n) {
            sum += a;
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("Sum of Fibonacci Series Till "+n+" is : "+sum);
    }
   
}
