package arrayprogramming.com;

import java.util.Scanner;

public class Pairs {
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
        int max=0, max2=0;
        for(int i=0;i<ar.length;i++)
        {
        	if(ar[i]>max)
        	{
        		max2=max;
        		max=ar[i];
        	}
        	else if(ar[i]>max2 && ar[i]!=max)
        	{
        		max2=ar[i];
        	}
        }
        System.out.println(max+max2);
	}

}
