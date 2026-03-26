package Series.Fibonacci;

/*
Check if given no is in fibonacci or not - return 0 if not else return index (starting from 1).

*/

public class isFibonacciSeries {
     // fib : 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
     
     static int isFib(int n){
      int a=0, b=1;
        
         int ind=1;
         while (a <= n) {
             if(n==a) 
                 return ind;
             //System.out.print("a : "+a + " , ind : "+ind+" , ");
             ind++;
             int next = a + b;
             a = b;
             b = next;
         }

        return 0;
     }

    public static void main(String[] args) {
        int num= 89 ;

        int ind = isFib(num);

        if(ind>0) System.out.println(num+" exists in fibonacci series at index : "+ind);
        else System.out.println(num+" doesn't exist in fibonacci series");
      
    }
}
