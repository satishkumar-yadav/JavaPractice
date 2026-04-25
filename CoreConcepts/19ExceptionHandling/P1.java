

public class P1 {
    public static void main(String[] args) {
        System.out.println("Main Starts");
        try {
            System.out.println(10/0);
        } catch (ArithmeticException ae) {
            System.out.println("Handled Exception");
        }
        System.out.println("Main Ends");
    }
}
