import java.util.Scanner;

class AlternatePallindromeNumberInRange 
{
	public static void main(String args[])
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a range: ");
	   int start=sc.nextInt();
	   int end = sc.nextInt();
     
     int count=0;
	   for(int i=start; i<=end; i++){
        int m=i;
        int rev=0;
        while(m>0)
        {
          rev=(rev*10)+(m%10);
          m/=10;  
        }   
           
        if(rev==i) {
        	count++;
        	if(count % 2 !=0){
        		System.out.print(i+" ");
        	}
        	   
        }	
	   }
	 
	}
}