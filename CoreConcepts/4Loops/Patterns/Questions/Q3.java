// Neon Number

public class Q3 {
   public static void main(String []args){
      int n=10;
      int sq=n*n;
      int sum=0;
       while(sq>0){
       sum += sq % 10;
       sq /=10;
       }
        if(n==sum) System.out.println("Neon Number ");
        else System.out.println("Not Neon Number ");

   }
    
}
