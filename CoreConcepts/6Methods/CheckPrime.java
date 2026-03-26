public class CheckPrime {
    static boolean isPrime(int n) {
        boolean flag = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

}
