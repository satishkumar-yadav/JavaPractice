import java.util.Arrays;

public record MobileDriver() {
     public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung", "Blue", 2999.00);
        Mobile m2 = new Mobile("Vivo", "White", 9999.00);
        Mobile m3 = new Mobile("MI", "Black", 4599.00);
        Mobile m4 = new Mobile("Realme", "Red", 8769.00);
        Mobile m5 = new Mobile("Oppo", "Blue", 87399.00);
       

        Mobile[] m= {m1,m2,m3,m4,m5};

        Arrays.sort(m);

        for (Mobile mb: m) {
            System.out.println(mb);
        }
    }
}
