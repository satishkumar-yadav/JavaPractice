/*
i/p : 5
o/p : 
        5 5 5 5 5 4 4 4 4 4 3 3 3 3 3 2 2 2 2 2 1 1 1 1 1
        5 5 5 5 4 4 4 4 3 3 3 3 2 2 2 2 1 1 1 1
        5 5 5 4 4 4 3 3 3 2 2 2 1 1 1 
        5 5 4 4 3 3 2 2 1 1
        5 4 3 2 1
        
i/p : 3
o/p: 
        3 3 3 2 2 2 1 1 1
        3 3 2 2 1 1
        3 2 1          

*/

//import java.util.Scanner;
public class P1 {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
       // int n= sc.nextInt();
       int n=5;

       int p=n;
        for (int i = n; i >= 1; i--) {  // for rows printing
            for (int j = 1; j <= n; j++) {          // for (int j = i; j >= 1; j--) {
                for (int k = i; k >=1 ; k--) {
                    System.out.print(p + " ");
                    }
                p--;
            }
            System.out.println();
            p=n;
           // System.out.println("i= "+i+"\t");
        }
    }
}
