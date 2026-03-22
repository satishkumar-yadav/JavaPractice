public class EmricNumber {
    public static void main(String[] args) {
        range(1, 100);
    }

    public static void range(int st, int end) {
        for (int i = st; i <= end; i++) {
            if (isPrime(i) && (isPrime(reverse(i))) )
                 System.out.println(i);
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        return rev ;
    }
}
