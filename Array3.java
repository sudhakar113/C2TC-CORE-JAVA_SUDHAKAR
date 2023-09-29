package com.array.application;
import java.util.Scanner;
public class Array3 {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int [] a=new int[5];
	for(int i=0;i<=4;i++)
	{
		System.out.println("Enter the ages ");
		a[i]=scan.nextInt();
	}
	System.out.println("the ages are:");
	for(int j=0;j<=4;j++)
	{
		System.out.println(a[j]);
	}

	}

}
