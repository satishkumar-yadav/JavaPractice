import java.util.Scanner;

class PrimeNo
{
	public static void main(String args[])
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a number: ");
	   int n = sc.nextInt();
     boolean flag=true;
           for(int j= 2; j<=n/2; j++ )
           {
              if(n % j==0)
              {
                flag=false;
               // System.out.println("prime  : "+n); 
                break;
              }
           }

           if(n>=2 && flag) System.out.println("The Given Number "+n+" is Prime.");
           else System.out.println("The Given Number "+n+" is not Prime.");
           
       
	}
}