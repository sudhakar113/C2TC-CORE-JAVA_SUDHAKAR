package arrayprogramming.com;

import java.util.*;
public class Maximum {
	
	static void max(int [] ar)
	{
		int max=0;
		System.out.println("the maximum elements are");
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
				
			}
			
		}
		System.out.println(max);
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the array size");
		int n=sc.nextInt();
		int [] ar=new int[n];
		System.out.println("Eneter the arry elements");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		max(ar);
		
	}

}
