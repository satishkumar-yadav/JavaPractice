public class HashSetUserProg {
    public static void main(String[] args) {
        HashSet h =new HashSet();

      //  h.add("Rama");
      //  h.add("Radha");
      //  h.add("Sita");
      //  h.add("Kittu");
      //  h.add("Banti");
      //  h.add("Vali");

      //  h.add("Sit");
      //  h.add("Kitu");
      //  h.add("Bati");
      //  h.add("Val");
      //  h.add("Vai");
      //  h.add("Vi");
      //  h.add("vali");

    h.add(10);
    h.add(40);
    h.add(70);
    h.add(80);
    h.add(20);     
    h.add(10);
    h.add(20);

      System.out.println("Size: "+h.size());
       h.display();
       System.out.println("==========");

        System.out.println(h.remove(10));

        System.out.println("==========");
        System.out.println("Size: " + h.size());
        h.display();

       //System.out.println(h.contains("rama"));

      // System.out.println(h.contains(40));

    }
}
