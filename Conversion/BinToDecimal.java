import java.util.Scanner;
public class BinToDecimal {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a Binary number to convert into decimal: ");
         int n = sc.nextInt();

         int dec=0;
         int i=1;
         while(n>0){
            dec+= (n%2)*i;
            n/=10;
            i*=2;
         }
         System.out.println(dec);
     }
}
