import java.util.Scanner;

class HighestPallindromeNumberInRange 
{
	public static void main(String args[])
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a range: ");
	   int start=sc.nextInt();
	   int end = sc.nextInt();
     
	   for(int i=end; i>=start; i--){
        int m=i;
        int rev=0;
        while(m>0)
        {
          rev=(rev*10)+(m%10);
          m/=10;  
        }   
           
        if(rev==i) {
        		System.out.print(i+" ");
        		break;   
        }	
	   }
	 
	}
}