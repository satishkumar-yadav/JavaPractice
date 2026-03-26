

/*
 int a=2, b=3;

// M-I Swap using traditional method, using 3rd variable
int temp=a;
    a=b;
    b=temp;

 Dry Run : 
         temp=a=2;
         a=b=3;
         b=temp=2;   

// M-II Swap without using third variable
a=a+b;
b=a-b;
a=a-b;

Dry run :
   a=2+3=5;
   b=5-3=2;
   a=5-2=3;


// M-III Swap using bitwise exor operator (same - 0, alternate -1)

  * same number xor = 0 => 5^5 = 0101 ^ 0101 = 0000 (0)
  * number xor 0 = same number => 7 ^ 0 = 0111 ^ 0000 = 0111 (7)

 a= 2(0010) , b= 3(0011)

 a = a ^ b;
 b = a ^ b;
 a = a ^ b;

 Dry Run :
       a = 2^3 = 0010 ^ 0011 = 0001 (1)
       b = 1^3 = 0001 ^ 0011 = 0010 (2)
       a = 1^2 = 0001 ^ 0010 = 0011 (3)

*/

public class Swap {
    
    // traditional swap using 3rd variable
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a : " + a + " , b : " + b);
    }

    // swap without using 3rd variable
    static void swap2(int a, int b) {
        a = a + b; // a=5+3=8
        b = a - b; // b=8-3=5
        a = a - b; // a=8-5=3

        System.out.println("a : " + a + " , b : " + b);
    }

    // swap using exor
    static void swap3(int a, int b) {
        // a = 5(0101) , b= 3(0011)

        a = a ^ b; // a= 5^3 = 0101 ^ 0011 = 0110 (6)
        b = a ^ b; // b= 6^3 = 0110 ^ 0011 = 0101 (5)
        a = a ^ b; // a= 6^5 = 0110 ^ 0101 = 0011 (3)

        System.out.println("a : " + a + " , b : " + b);
    }

    public static void main(String[] args) {
        int a = 5, b = 3;

        swap(a, b);

        swap2(a, b);

        swap3(a, b);
    }

}
