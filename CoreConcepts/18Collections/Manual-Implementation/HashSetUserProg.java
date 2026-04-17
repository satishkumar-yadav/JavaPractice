public class HashSetUserProg {
    public static void main(String[] args) {
        HashSet h =new HashSet();

       h.add("Rama");
       h.add("Radha");
       h.add("Sita");
       h.add("Kittu");
       h.add("Banti");
       h.add("Vali");

    // h.add(10);
    // h.add(40);
    // h.add(70);
    // h.add(80);
    // h.add(20);
    // h.add(10);
    // h.add(20);

      System.out.println("Size: "+h.size());
       h.display();
       System.out.println("==========");

       System.out.println(h.remove("Vali"));

       System.out.println("Size: " + h.size());
       h.display();

       //System.out.println(h.contains("Vali"));

      // System.out.println(h.contains(40));

    }
}
