import java.util.Scanner;

class AutomorphicNumber
{
	public static void main(String args[])
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a number: ");
	   int n=sc.nextInt();
	   int sq= n*n;
       boolean flag=true;
       while(n>0){
       	if((n%10) != (sq%10)){
       		flag=false;
       		break;
       	}
       	n/=10;
       	sq/=10;
       }
        if(flag) System.out.println("Automorphic Number ");
        else System.out.println("Not Automorphic Number ");
            		  
	}
}