
public class Dabgling3 {
    public static void main(String[] args) {
        int a = 5;

        //Confusing Identation
        // no output
        if (a > 10) 
            if (a > 20)
                System.out.println("A");
        else
            System.out.println("B");


        // compiler ignores identation, Actual Meaning : 
        /*
          if(a>10){
               if(a>20) sop("A");
               else sop("B");
          }
        */

    }
}
