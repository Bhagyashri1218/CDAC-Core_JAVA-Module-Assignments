/*
21.	Program to show sum and average of 10 element array. Accept array elements from user
*/
import java.util.Scanner;
class ArrayS{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements in array");
		int ar[] = new int[10];
		for(int i = 0; i<10;i++)
		{
			ar[i] = sc.nextInt();
		}
		System.out.println("elements in array : ");
		int sum = 0;
		for(int i = 0; i<10;i++)
		{
			sum = sum + ar[i];
		}
		System.out.println("sum of array  : "+sum);
		float avg = sum/10;
		System.out.println("Average of array elements "+avg);
	}
}