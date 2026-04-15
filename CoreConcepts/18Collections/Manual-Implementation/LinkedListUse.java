import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListUse {
    public static void main(String[] args) {
        List<Integer> li = new LinkedList<>();

        li.add(1);
        li.add(2);
        li.add(3);
        System.out.println(li);

        li.add(1, 50);
        System.out.println(li);

        System.out.println(li.get(1));

        List<Integer> lst = new ArrayList<>();
        lst.add(150);
        lst.add(160);

        li.addAll(lst);
        System.out.println(li);

        
    }
}
