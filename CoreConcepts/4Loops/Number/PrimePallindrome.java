class PrimePallindrome
{
    public static void main(String[] args) {
        range(1,200);
    }

    public static void range(int st, int end)
    {
        for (int i = st; i <= end; i++) {
            if (isPrime(i) && isPallindrome(i))
                System.out.println(i);
        }
    }

    public static boolean isPrime(int n){
        if(n<=1) return false;
        for (int i = 2; i <= n/2; i++) {
            if(n%i==0) return false;
        }
        return true;
    }

    public static boolean isPallindrome(int n)
    {
        int m = n;
        int rev = 0;
        while (n > 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        return rev==m;
    }
}