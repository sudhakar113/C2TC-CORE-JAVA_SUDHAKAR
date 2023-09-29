package arrayprogramming.com;

import java.util.Scanner;

public class UniqueElement 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
        int[] arr =new int[N];
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) 
            {
                if (i != j && arr[i] == arr[j]) 
                {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) 
            {
                count++;
            }
        }
     
       
	}
}


