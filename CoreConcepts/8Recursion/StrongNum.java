public class StrongNum {
    public static void main(String []args){
        int n=145;
        if(isStrong(n,n,0)) System.out.println("Strong number");
        else System.out.println("Not Strong number");
    }

    public static int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }

    public static boolean isStrong(int n, int m, int sum){
        if (n==0) return m==sum;
        return isStrong(n/10, m, sum+= fact(n%10));
         //sum+= fact(n%10);
       //return isStrong(n/10, m, sum);
    } 
}
