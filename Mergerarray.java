package arrayprogramming.com;

import java.util.Scanner;

public class Mergerarray {
public static void main(String[] args) {
 
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] ar=new int[n];
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=sc.nextInt();
	}

	int m=sc.nextInt();
	int[] ar1=new int[m];
	for(int i=0;i<ar1.length;i++)
	{
		ar1[i]=sc.nextInt();
	}
	mergeArray(ar,ar1);
}

private static void mergeArray(int[] ar, int[] ar1) {
	// TODO Auto-generated method stub
	
	
}
}
