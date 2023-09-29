package com.array.application;
import java.util.Scanner;
public class Array4 {
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int [][] a=new int[2][5];
     for(int i=0;i<=1;i++)
     {
    	 for(int j=0;j<=4;j++)
    	 {
    		 System.out.println("Eneter the ages");
    		 a[i][j]=sc.nextInt();
    	 }
     }
    	 System.out.println("the ages are");
    	 for(int i=0;i<=1;i++)
         {
        	 for(int j=0;j<=4;j++)
        	 {
        		 System.out.print(a[i][j] + " ");
        	 }
        	 System.out.println();
        	 
     }
	}

}
