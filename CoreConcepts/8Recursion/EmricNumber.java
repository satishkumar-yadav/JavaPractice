public class EmricNumber {

    public static void main(String args[]){
        //int n=13;
        range(10,1000);
    }

     public static void range(int st, int end){
        if(st>end) return;
        if(isEmric(st)) System.out.println(st);
        range(st+1,end);
    } 

    public static boolean isPrime(int n, int i){
        if(i==1) return true;
        if(n<=1 || n%i==0) return false;
        return isPrime(n,i-1);
    }

    public static int rev(int n, int r){
        if(n==0) return r;
        return rev(n/10, r=(r*10)+(n%10));
    }

    public static boolean isEmric(int n){
        int r=rev(n,0);
        return (isPrime(n,n/2) && isPrime(r,r/2));
    }
}
