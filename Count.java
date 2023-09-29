package arrayprogramming.com;

import java.util.Scanner;

public class Count {
    static void min(int[] ar) {
        int min = ar[0]; // Set the initial value to the first element of the array
        for (int i = 1; i < ar.length; i++) 
        {
            if (ar[i] < min) {
                min = ar[i]; // Update min if a smaller element is found
            }
        }
        System.out.println("The minimum value in the array is: " + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        min(ar);
    
}
}
	

