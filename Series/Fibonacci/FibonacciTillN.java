package Series.Fibonacci;

/*
Algo
1.Print first two number
2.Generate next number
3.If next > range -> stop
4.Otherwise print it
5.Shift numbers
6.Repeat

Dry Run (range=15) : 
a   b   c=a+b   print
0   1   1       1
1   1   2       2
1   2   3       3
2   3   5       5
3   5   8       8
5   8   13      13
8   13  21      STOP (21>15)

*/

//Print fibonacci within a range or less than a range
public class FibonacciTillN {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int n=45;

        // M - I
        //System.out.print(a + " " + b + " ");
        // for (; ; ) {
        //    int c = a + b;
        //     if (c > n)
        //         break;
        // System.out.print(c + " "); 
        //     a = b;
        //     b = c;
        // }

        // M - II
        // System.out.print(a + " " + b + " ");
        // while(true){
        //     int c = a + b;
        //     if (c > n)
        //         break;
        //     System.out.print(c + " ");
        //     a = b;
        //     b = c;
        // }

        // M - III
        //optimised - best for interviews
        while (a<=n) {
            System.out.print(a + " ");
            int next = a+b;
            a=b;
            b=next;
        }
    }
}
