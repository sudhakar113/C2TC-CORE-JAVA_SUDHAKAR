package arrayprogramming.com;
import java.util.*;
public class Printallthepairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		printpairs(ar);

	}

	private static void printpairs(int[] ar) {
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				System.out.println(ar[i]+ " "+ ar[j]);
			}
		}
		
	}

}
