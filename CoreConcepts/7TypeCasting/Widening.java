
public class Widening {
    public static void main(String[] args) {
        byte a=10;
        int b=a;
        System.out.println(a+" "+b);  // 10 10

        int c = 10;
        double d = c;
        System.out.println(c + " " + d);   // 10 10.0

        char e = 'C';
        int f = e;
        System.out.println(e + " " + f);  //  C 67

        byte g = 100;
        double h = g;
        System.out.println(g + " " + h);  // 100  100.0

        widening(a);
        widening(b);
        widening(c);
        widening(d);
        widening(e);
        widening(f);
        widening(g);
        widening(h);
    }

    public static void widening(double d){
        System.out.println("Printing from Inside Widening Method");
        System.out.println(d);
    }
}
