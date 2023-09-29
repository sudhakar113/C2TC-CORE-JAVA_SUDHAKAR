package com.array.application;

import java.util.Scanner;
public class Array41 {
	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	int [][][] a=new int[2][3][5];
	for(int i=0;i<=1;i++)
	{
		for(int j=0;j<=2;j++)
		{
			for(int k=0;k<=4;k++)
			{
				System.out.println("eneter the present in "+i + "  " +"schools "   +j+  " classroom "  +k+ " Students ");
				a[i][j][k]=scan.nextInt();
			}
		}
	}
	System.out.println("the ages are");
	for(int i=0;i<=1;i++)
	{
		for(int j=0;j<=2;j++)
		{
			for(int k=0;k<=4;k++)
			{
				System.out.print(a[i][j][k]+ " ");
			}
	
		System.out.println();
		
	}
		System.out.println();

	}
	}
}
