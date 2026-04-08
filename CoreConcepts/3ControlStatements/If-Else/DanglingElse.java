

public class DanglingElse {
    public static void main(String[] args) {
        int a=10, b =20;

        if(a>5)
             if(b>25) System.out.println("A");
             else System.out.println("B");   // else belongs to nearest unmatched if  , o/p: B

        /*
         if(a>5) {
                if(b>25) {sop("A"); }
                else { sop("B");  }  
         }
         */
    }
}
