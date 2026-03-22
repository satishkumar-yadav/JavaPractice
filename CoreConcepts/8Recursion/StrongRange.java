public class StrongRange {
    public static void main(String[] args) {
       range(1,1000);
    }

    public static void range(int st, int end) {
        if (st > end)
            return;
        if (isStrong(st, st, 0))
            System.out.println(st);

        range(st + 1, end);
    }

    public static int fact(int n) {
        if (n == 0)
            return 1;
        return n * fact(n - 1);
    }

    public static boolean isStrong(int n, int m, int sum) {
        if (n == 0)
            return m == sum;
        return isStrong(n / 10, m, sum += fact(n % 10));
    }
}
