package com.array.application;
import java.util.Scanner;
public class Array5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int  [][][] a=new int[2][3][5];
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				for(int k=0;k<=a[i][j].length-1;k++)
				{
					System.out.println("Enetr the ages of student present in "+i+ " school " +j+ " classroom "+k+ " Student ");
					a[i][j][k]=scan.nextInt();
				}
			}
		}
		System.out.println("the ages are");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				for(int k=0;k<=a[i][j].length-1;k++)
				{
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
	}

}
	}
}

