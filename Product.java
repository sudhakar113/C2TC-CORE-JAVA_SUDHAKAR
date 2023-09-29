package arrayprogramming.com;

import java.util.Scanner;

public class Product {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int n = scanner.nextInt();

	        int[] array = new int[n];
	        System.out.println("Enter the elements of the array:");

	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }

	        int res= findProduct(array);
	        System.out.println(res);
	    }

	    public static int findProduct(int[] arr) {
	        int product = 1;
	        for (int num : arr) {
	            product *= num;
	        }
	        return product;
	    }
	    
	}



