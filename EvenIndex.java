package arrayprogramming.com;

import java.util.Scanner;

public class EvenIndex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int [] ar=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("the even numbers are");
		for(int j=0;j<ar.length;j++)
		{
			if(j%2!=0)
			{
				System.out.println(ar[j]+ " ");
			}
		}
		
		System.out.println("the odd numbers");
		for (int j = 0; j < ar.length; j++)
		{
            if (j % 2 == 0)
            {
                System.out.print(ar[j] + " ");
            }
        }
	}

}
