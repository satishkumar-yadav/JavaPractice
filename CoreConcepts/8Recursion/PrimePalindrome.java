public class PrimePalindrome {
    public static void main(String[] args) {
        int n=11;

        //Practical Time Complexity
        long start = System.nanoTime();
       // long start = System.currentTimeMillis();

       //Practical Space Complexity
       Runtime rt = Runtime.getRuntime();
       rt.gc();   // request GC (not guaranteed)

       long memBefore = rt.totalMemory()-rt.freeMemory();

       // System.out.println(isPrimePalindrom(n));
        range(10,1000);

        long end = System.nanoTime();
        long memAfter = rt.totalMemory()-rt.freeMemory();
        System.out.println("\n Time Taken : "+(end-start)+" ns");
        System.out.print(" Memory Used : "+(memAfter-memBefore)+" bytes");
    }

    public static void range(int st, int end){
        if(st>end) return;
        if(isPrimePalindrom(st)) System.out.println(st);
        range(st+1,end);
    } 

    public static boolean isPrime(int n, int i){
        if(i==1) return true;
        if(n<=1 || n%i==0) return false;
        return isPrime(n,i-1);
    }

    public static boolean isPallindrome(int n, int m, int rev){
        if(n==0) return m==rev;
        return isPallindrome(n/10,m, rev=(rev*10)+(n%10));
    }

    public static boolean isPrimePalindrom(int n){
        return (isPrime(n,n/2) && isPallindrome(n,n,0));
    }
}
