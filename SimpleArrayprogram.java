package arrayprogramming.com;

import java.util.Scanner;

public class SimpleArrayprogram 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("eneter the size of array");
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
			
		}
		System.out.println("the array numbers are");
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
		
	}

}
