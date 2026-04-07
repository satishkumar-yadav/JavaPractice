import java.util.Arrays;
import java.util.Scanner;

public class Mobile2Driver { 
    static int count = 0;
     
    static void display(Mobile2 []m){
        for(int i=0; i<count; i++)  System.out.println(m[i]);
      //  for (Mobile2 mob : m) System.out.println(mob);
    }

    public static void main(String[] args) {
      int n=10;
      Mobile2[] m = new Mobile2[n];
      // for(int i=0;i<m.length;i++){ if(m[i] != null) count++;  }
       Scanner s = new Scanner(System.in);

       while (true) {
           System.out.println("\n Enter 1:Add, 2: SortByName, 3.SortByColor, 4.SortByRam, 5.SortByRom, 6.SortByPrice-Low-To-High, 7.SortByPrice-High-To-Low, 8.Exit");
           int ch = s.nextInt();

           switch (ch) {
            case 1: {
                 System.out.println("\n Enter Mobile Details: Name, Ram, Rom, Price, Color");
                 String name = s.next();
                 int ram = s.nextInt();
                 int rom = s.nextInt();
                 double price = s.nextDouble();
                 String color = s.next();

                 m[count++] = new Mobile2(name, ram, rom, price, color);
                 System.out.println("Mobile added Successfully.");
                 display(m);
            } 
                
                break;
            case 2: { if(count>=2) {        //   { if(m.length>=2) {
                      // Arrays.sort(m, (new Sort.SortByName()));
                      Arrays.sort(m, 0, count, (new Sort.SortByName()));
                      display(m); }
                    else  System.out.println("\n Add at least 2 Mobiles first !");
                    }
                break;
            case 3: {
                if (count >= 2) {
                    Arrays.sort(m,  0, count, (new Sort.SortByColor()));
                    display(m);
                } else
                    System.out.println("\n Add at least 2 Mobiles first !");
            }
                break;    
            case 4: {
                if (count >= 2) {
                    Arrays.sort(m,  0, count, (new Sort.SortByRam()));
                    display(m);
                } else
                    System.out.println("\n Add at least 2 Mobiles first !");
            }
                break;
            case 5: {
                if (count >= 2) {
                    Arrays.sort(m,  0, count, (new Sort.SortByRom()));
                    display(m);
                } else
                    System.out.println("\n Add at least 2 Mobiles first !");
            }
                break;
            case 6: {
                if (count >= 2) {
                    Arrays.sort(m,  0, count, (new Sort.SortByPriceLtoH()));
                    display(m);
                } else
                    System.out.println("\n Add at least 2 Mobiles first !");
            }
                break;
            case 7: {
                if (count >= 2) {
                    Arrays.sort(m,  0, count, (new Sort.SortByPriceHtoL()));
                    display(m);
                } else
                    System.out.println("\n Add at least 2 Mobiles first !");
            }
                break;
            case 8: { s.close();  return;}
                              
           }
       }

    }
}