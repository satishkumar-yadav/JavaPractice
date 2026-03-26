
class EvenNumber
{
    // Normal Even Odd Program
   static void evenNumber(int n){
        if (n % 2 == 0)
            System.out.println(n + " is even");
        else
            System.out.println(n + " is odd");
    }

    // Interview Question
    //Even odd Program without using % or / operator
    static void evenNumber2(int n) {
        if ( (n&1) == 0)
            System.out.println(n + " is even");
        else
            System.out.println(n + " is odd");
    }

    public static void main(String[] args) {
      int n=67;
      
       evenNumber(n);
       evenNumber2(n);
    }
}