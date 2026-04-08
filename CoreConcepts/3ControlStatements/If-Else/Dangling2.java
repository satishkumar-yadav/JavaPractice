

public class Dangling2 {
    public static void main(String[] args) {
        int a = 10, b = 20;

        // no output
        if (a > 5){
            if (b>25) 
                System.out.println("A");
        }
        else System.out.println("B");
            
    }
}
