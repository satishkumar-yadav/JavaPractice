import java.util.Scanner;

class PrimeNoInRange 
{
	public static void main(String args[])
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a range: ");
	   int start = sc.nextInt();
	   int end = sc.nextInt();
       //int prime= 0;
 
        // boolean flag=true;
        for(int i=start; i<=end; i++)
        {
           boolean flag=true;
           for(int j= 2; j<=i/2; j++ )
           {
              if(i % j==0)
              {
                flag=false;
               // System.out.println("prime  : "+i); 
                break;
              }
           }

           if(i>=2 && flag) {
             // prime= prime * 10+ i;
              System.out.print(i+" ");
           }
           // else {
           // 	  //System.out.print("/n non-prime  : "+i);
           // }
        }  

        //System.out.println("PrimeNo from "+start+" to "+end+" are: "+prime);
	}
}