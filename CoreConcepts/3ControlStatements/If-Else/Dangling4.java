

public class Dangling4 {
    public static void main(String[] args) {
        int a = 5;

        // Tricky Else ,  o/p : C
        if (a > 10) 
            if (a > 20)
                System.out.println("A");
            else
                System.out.println("B");
        else
            System.out.println("C");
    }
}
