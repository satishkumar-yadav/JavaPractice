
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//using predefined ArrayList
public class ArrayListUse {
    public static void main(String[] args) {
        
       // ArrayList studentsName = new ArrayList<>();
       // ArrayList<String> studentsName = new ArrayList<>();   // incre size = n+ n/2 + 1

      //  studentsName.add("Rakesh");
        //studentsName.add(45);


      //  ArrayList<Integer> list = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        list.add(1);  //add at end
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);

        list.add(1, 50);   // add 50 at index 1
        System.out.println(list);

        list.set(2, 1000);   // update the value at given index
        
        System.out.println(list.contains(50));   // return true if given element is present in list

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        for (Integer element : list) {
            System.out.println("for each element is : "+element);
        }
         System.out.println();

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println("iterator: "+it.next());
        } 

        List<Integer> newList = new ArrayList<>();
        
        newList.add(150);
        newList.add(160);

        list.addAll(newList);    // this will add all the elements
        System.out.println(list);

        System.out.println(list.get(1));

        list.remove(1);   // remove element at passed index
        System.out.println(list);

        list.remove(Integer.valueOf(150));   // remove the passed value
        System.out.println(list);

       list.clear();   // remove all elements
       System.out.println(list);

       

    }
}
