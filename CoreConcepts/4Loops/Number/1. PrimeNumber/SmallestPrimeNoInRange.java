import java.util.Scanner;

class SmallestPrimeNoInRange 
{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a range: ");
     int start = sc.nextInt();
     int end = sc.nextInt();
       
        if(start<0 && end<2) {
          System.out.println("no prime number exist in the range below 2");
          return;
        }
        if(start<0 && end>2) {
          System.out.println("no prime number exist in the range: "+start+" to "+2+" or below 2");
        }

        System.out.println("Printing Smallest Prime Number for range after 1: ");
        for(int i=start; i<=end; i++)
        {
           boolean flag=true;
           for(int j= 2; j<=i/2; j++ )
           {
              if(i % j==0)
              {
                flag=false;
                break;
              }
           }

           if(i>=2 && flag) {
             System.out.print(i+" ");
             break;
           }
           
        }  

       
  }
}