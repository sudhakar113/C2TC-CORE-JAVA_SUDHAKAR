package arrayprogramming.com;

import java.util.Scanner;

public class Sumisequaltok {
	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] ar=new int[n];
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=sc.nextInt();
	}
	int k=sc.nextInt();
	
	printpairs(ar,k);

}

private static void printpairs(int[] ar,int k) {
	for(int i=0;i<ar.length;i++)
	{
		for(int j=i+1;j<ar.length;j++)
		{ 
			int sum=ar[i]+ar[j];
			//different piars
			int sum1=ar[j]-ar[i];
			if(sum==k)
			{
				
			System.out.println(ar[i]+ " "+ ar[j]+ "sum: "+sum);
		}
	}
	
	}
}
}


