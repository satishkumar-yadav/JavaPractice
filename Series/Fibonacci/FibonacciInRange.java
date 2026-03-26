package Series.Fibonacci;

public class FibonacciInRange {
    public static void main(String[] args) {
        int st = 21, end = 90;

        int a = 0, b = 1;

        //** */jump directly near st - needs checking
        //  while (b<st) {
        //     int next=a+b;
        //     a=b;
        //     b=next;
        //  }


        // M - I => print fibonacci in range
        while (a<=end) {
            if (a>=st ) {
                System.out.print(a + " "); 
            }
            int next = a + b;
            a = b;
            b = next;
        }

        // M- II
        // for (; a <= end; ) {
        //     if (a >= st) {
        //         System.out.print(a + " ");
        //     }
        //     int next = a + b;
        //     a = b;
        //     b = next;
        // }
    }
   
}
