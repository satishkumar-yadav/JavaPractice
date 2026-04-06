import java.util.Arrays;
import java.util.Scanner;

public class Mobile2Driver {
     
    static void display(Mobile2 []m){
        for (Mobile2 mob : m) {
            System.out.println(mob);
        }
    }

    public static void main(String[] args) {
       Mobile2 m1 = new Mobile2("Oppo", 4, 128, 8000, "While");
       Mobile2 m2 = new Mobile2("Poco", 8, 256, 15000, "Blue");
       Mobile2 m3 = new Mobile2("Vivo", 6, 64, 9000, "Red");
       Mobile2 m4 = new Mobile2("Mi", 2, 32, 4000, "Black");
       Mobile2 m5 = new Mobile2("Samsung", 12, 512, 42000, "Aqua");

       Mobile2 [] m = {m1};

       Scanner s = new Scanner(System.in);

       while (true) {
           System.out.println("\n Enter 1:Add, 2: SortByName, 3.SortByColor, 4.SortByRam, 5.SortByRom, 6.SortByPrice-Low-To-High, 7.SortByPrice-High-To-Low, 8.Exit");
           int ch = s.nextInt();

           switch (ch) {
            case 1: System.out.println("Mobile Added.");
                
                break;
            case 2: { if(m.length>=2) {
                       Arrays.sort(m, (new Sort.SortByName()));
                      display(m); }
                    else  System.out.println("Add at least 2 Mobiles first !");
                    }
                break;
            case 3: {
                if (m.length >= 2) {
                    Arrays.sort(m, (new Sort.SortByColor()));
                    display(m);
                } else
                    System.out.println("Add at least 2 Mobiles first !");
            }
                break;    
            case 4: {
                if (m.length >= 2) {
                    Arrays.sort(m, (new Sort.SortByRam()));
                    display(m);
                } else
                    System.out.println("Add at least 2 Mobiles first !");
            }
                break;
            case 5: {
                if (m.length >= 2) {
                    Arrays.sort(m, (new Sort.SortByRom()));
                    display(m);
                } else
                    System.out.println("Add at least 2 Mobiles first !");
            }
                break;
            case 6: {
                if (m.length >= 2) {
                    Arrays.sort(m, (new Sort.SortByPriceLtoH()));
                    display(m);
                } else
                    System.out.println("Add at least 2 Mobiles first !");
            }
                break;
            case 7: {
                if (m.length >= 2) {
                    Arrays.sort(m, (new Sort.SortByPriceHtoL()));
                    display(m);
                } else
                    System.out.println("Add at least 2 Mobiles first !");
            }
                break;
            case 8: return ;
                              
           }
       }

      

    }
}