
import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal number to convert into binary: ");
        int n =sc.nextInt();

        int bin=0;
        int i=1;
        while(n>0){
            bin= (n%2)*i +bin;
            i *=10;
            n /=2;
        }
          System.out.println(bin);
    }
}
