import java.util.Arrays;

public class EmpDriver {

    public static void main(String[] args) {
        Emp e1 = new Emp("Ram", 29, 3);
        Emp e2 = new Emp("Sita", 26, 1);
        Emp e3 = new Emp("Laxman", 27, 2);
        Emp e4 = new Emp("Hanuman", 28, 4);
        Emp e5 = new Emp("Vali", 30, 3);

        Emp[] e= {e1,e2,e3,e4,e5};

        Arrays.sort(e);

        for (Emp emp: e) {
            System.out.println(emp);
        }
    }
}