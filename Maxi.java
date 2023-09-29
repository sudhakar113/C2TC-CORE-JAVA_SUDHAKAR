package arrayprogramming.com;

import java.util.Scanner;

public class Maxi {
	
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
		/*int max=INTEGER.MIN_VALUE;
		int maxi=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
				maxi=i;
			}
		}
		System.out.println(maxi);
		
	}

}*/
	}
}
