

public class Reverse {
    public static int reverseDigit(int num){
        int rev=0; 
        int i=1;   // i=10 fixed
        while(num>0){
           rev= (rev*i) + (num%10);
           num /=10;
           i*=10;
        }
        return rev; 
    }
}
