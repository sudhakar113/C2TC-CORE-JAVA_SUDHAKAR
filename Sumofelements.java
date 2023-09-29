package arrayprogramming.com;

import java.util.Scanner;

public class Sumofelements 
{
	public static int SumOfElements(int [] ar)
	{
		System.out.println("the sum of array");
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		//System.out.println(sum);
		return sum;
		
	}
	
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int n=sc.nextInt();
	int [] ar= new int[n];
	System.out.println("Enter the array number");
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=sc.nextInt();
	}
    int res= SumOfElements(ar);
    System.out.println(res);
}
}
	
	
	

