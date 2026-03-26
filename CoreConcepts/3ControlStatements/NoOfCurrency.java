package ControlStatement;

// print no of currencies required for a given amount
public class NoOfCurrency {
    public static void main(String[] args) {
        int n = 1800;

        // currency available 2000, 500, 200, 100
        if(n>=2000){
            System.out.println("2000 X : "+ n/2000);
            n %=2000;
        }
        if (n >= 500) {
            System.out.println("500 X : " + n / 500);
            n %= 500;
        }
        if (n >= 200) {
            System.out.println("200 X : " + n / 200);
            n %= 200;
        }
        if (n >= 100) {
            System.out.println("100 X : " + n / 100);
            n %= 200;
        }
    }
}
