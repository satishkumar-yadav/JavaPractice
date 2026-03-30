//print prime number in right triangle pattern

public class PrimeRightTriangle {
    static int count = 2;

    static int prime(int n){
        boolean flag= true;
        for(int i=2; i*i<=n;i++){
            if((n%i)==0) {
                flag = false;
                break;
            }
        } 
        if (flag)
            return n;
       else return prime(++count);
    }

    public static void main(String[] args) {
        int n=7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(prime(count)+" ");
                count++;
            }
            System.out.println();
        }
    }
}
