

public class Test {
    public static void main(String[] args) {
        //A a = new B();  // upcasting    - B to A
        // B b = (B) a;  // downcasting   - A to B 
        // Integer n = 30 ; //autoBoxing   - Integer - Object = upcasting
        // int n = new Integer(30); //Auto Unboxing   - 

        ArrayList list = new ArrayList();
      //  System.out.println(list.size());
      //  System.out.println(list);

      //  list.add(20);  // autoboxing   primitive to Wrapper   , new Integer(20);
        // list.add(30);
        // list.add(10);
        // list.add(80);
        // list.add(60);
        // list.add(90);
        // list.add(40);
        // list.add(50);
         list.add(70);
         list.add(5);
        //list.add(new Integer(3));  // deprecated


        System.out.println(list.size());
        System.out.println(list);


        list.add(0, 25);
       // list.add(1, 35);

      //  System.out.println(list.get(0));


      //  list.remove(0);
        System.out.println(list.size());
        System.out.println(list);

    }
} 
