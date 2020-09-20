/*
19.	Calculate  series : 12+22+32+42+.........+n2
*/
import java.util.Scanner;
class Calc{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting and Ending number of series ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int sum = 0;
		for(int i = n1; i<= n2 ; i=i+10)
		{
			sum = sum + i;
			System.out.println("Number in series = "+i);
		}
		System.out.println("Sum of series = "+sum);
		
	}
}