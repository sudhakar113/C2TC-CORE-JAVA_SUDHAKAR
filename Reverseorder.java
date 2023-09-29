package arrayprogramming.com;

import java.util.Scanner;

public class Reverseorder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        // Reading the array elements from the user
        for (int  k = 0; k < n; k++) {
            arr[k] = sc.nextInt();
        }

        System.out.println("The elements in reverse order are:");

        // Printing the array elements in reverse order
        for (int k = n - 1; k >= 0; k--) {
            System.out.print(arr[k] + " ");
        }
    }
}



