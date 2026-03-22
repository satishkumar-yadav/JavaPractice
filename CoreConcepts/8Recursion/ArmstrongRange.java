public class ArmstrongRange {
   // static int l;
    public static void main(String[] args) {
        range(10, 400);
       
    }

    public static void range(int st, int end) {
        if (st > end)
            return;
       // l=(st+"").length();
        if (isArmstrong(st))
            System.out.println(st);
       
        range(st + 1, end);
    }

    public static boolean isArmstrong(int n){
        return isArmstrong(n, n, 0, (n+"").length());
    }

    public static  boolean isArmstrong(int n, int m, int sum, int l ){
        if(n==0)  return m == sum;
        return isArmstrong(n/10, m, sum+=Math.pow(n%10, l), l);
    }
}
