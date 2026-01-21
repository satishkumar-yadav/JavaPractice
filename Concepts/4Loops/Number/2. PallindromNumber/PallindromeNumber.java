import java.util.Scanner;

class PallindromeNumber // check for 01010
{
	public static void main(String args[])
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a number: ");
	   int n = sc.nextInt();
	   int m=n;
     int rev=0;
     while(n>0)
     {
       rev=(rev*10)+(n%10);
       n/=10;  
     }   
           
     if(rev==m) System.out.println("Given number is Pallindrome.");
     else  System.out.println("Given number is not Pallindrome.");
        
	}
}