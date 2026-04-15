import java.util.Set;
//import java.util.LinkedHashSet;  // getting error

public class LinkedHashSetUse {
     public static void main(String[] args) {
        Set<Integer> set = new java.util.LinkedHashSet<>();

        set.add(32);  // stores values in hash - hgdydfydy5s,   every value has unique hash and same hash for same value
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);

        // set.add(54); // nothing happens, this won't get added
        // set.add(54);
        // set.add(54);

        System.out.println(set);

        set.remove(54);
        System.out.println(set);

        System.out.println(set.contains(100));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

        System.out.println(set);
    }
}
