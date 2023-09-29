package arrayprogramming.com;

import java.util.Scanner;

public class Repeated {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the array size");
	    int n = sc.nextInt();
	    int[] ar = new int[n];
	    System.out.println("Enter the array elements");
	    for (int i = 0; i < ar.length; i++)
	    {
	        ar[i] = sc.nextInt();
	    }
	    int count=1;
	    for(int i=0;i<ar.length;i++)
	    {
	    	if(ar[i]==ar[i+1])
	    	{
	    		count++;
	    	}
	    	else
	    	{
	    		System.out.println(ar[i]+ " "+ count);
	    		count=1;
	    	}
	    	
	    }
	    System.out.println(ar[ar.length-1]+ " "+ count);
}
}
