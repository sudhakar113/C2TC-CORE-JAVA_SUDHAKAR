package arrayprogramming.com;

import java.util.Scanner;

public class ProductExcept1element {
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
    int product=1;
    for(int i=0;i<ar.length;i++)
    {
    	product=product*ar[i];
    }
    for(int i=0;i<ar.length;i++)
    {
    	System.out.println(product/ar[i]);
    }

}
}
