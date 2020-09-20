/*
22.	Sort a ten element array in descending order.
*/
import java.util.*;
class SortArr{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in array");
		int n = sc.nextInt();
		System.out.println("Enter elements in array");
		int ar[] = new int[n];
		for(int i = 0; i<n-1;i++)
		{
			ar[i] = sc.nextInt();
		}
		Arrays.sort(ar);
		System.out.println("Sorted elements in array :");
		for(int i = n-1; i>=0 ; i--)
		{
			System.out.println(ar[i]);
		}
		
	}
}