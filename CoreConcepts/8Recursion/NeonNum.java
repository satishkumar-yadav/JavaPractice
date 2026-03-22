  class NeonNum{
      public static void main(String []args){
        int n = 9;
        if(isNeon(n, n*n, 0)) System.out.println("Neon Number");
        else System.out.println("Not Neon Number");
      }

      public static boolean isNeon(int n, int sq, int sum){
        if(sq==0) return (sum==n);
        sum += sq%10; 
        return isNeon(n,sq/10, sum);
      }
  } 