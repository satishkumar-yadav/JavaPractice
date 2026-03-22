import java.util.Scanner;

class PerfectNumber
{
	public static void main(String args[])
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a number: ");
	   int n= sc.nextInt();    
	   int sum=0;
     for(int j=1; j<=n/2; j++){
        	if(n%j==0) sum+=j;
        }
           
        if(n==sum) {
        		System.out.println("Number if Perfect");
        		   
        }	
        else System.out.println("not perfect number");
	   
	 
	}
}