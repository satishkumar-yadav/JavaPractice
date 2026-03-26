package ControlStatement;

public class LargestOfThree {
    public static void main(String[] args) {
        int a=7, b=6, c=6;

        if(a>b){
            if(a>c) System.out.println(a+" is greatest");
            else if(c>a) System.out.println(c+" is greatest");
            else System.out.println("both "+a+" & "+c+" are greatest");
        }
        else if(b>a){
            if (b > c)
                System.out.println(b + " is greatest");
            else if (c > b)
                System.out.println(c + " is greatest");
            else
                System.out.println("both " + b + " & " + c + " are greatest");
        }
        else{
            if(c>a) System.out.println(c+" is greatest");
            else if (c < b)
                System.out.println("both " + a + " & " + b + " are greatest");
            else
                System.out.println("all are equal");
        }

        // usimg ternary operator
      int largest1 =  (a>b) 
                     ? (a>c ? a: c  )  
                     : ( b>c ? b: c );
      System.out.println(largest1+" is greatest");

      // equal case in ternary operator
      if(a==b && b==c)
          System.out.println("All are equal");
      else {
          int largest2 = (a >= b)
                  ? (a >= c ? a : c)
                  : (b >= c ? b : c);
          System.out.println(largest2 + " is greatest");
      }  


      //using built-in function
      int largest = Math.max(a, Math.max(b,c));
      System.out.println(largest + " is greatest");

    }
}
