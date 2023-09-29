package arrayprogramming.com;
import java.util.*;
public class Demo 
{
	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	int [] ar=new int[5];
	System.out.println("eneter a  number");
	for(int i=0;i<ar.length;i++)
	{
		
		ar[i]=scan.nextInt();
	}
	
	
	
	for(int j=0;j<ar.length;j++)
	{
	
		if(j%2==0)
		{
			System.out.println("the even numbers are");
			System.out.println(ar[j]);
		}
		
	}
	}
}