/*
08.	Write a program to find the simple interest. Take the principle amount, rate of interest and time from user using Scanner class
*/
import java.util.Scanner;
class Si{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle amount ");
		int p = sc.nextInt();
		System.out.println("Enter rate of interest ");
		float r = sc.nextFloat();
		System.out.println("Enter Time ");
		int t = sc.nextInt();
		
		double si = (p * r * t)/100;
		System.out.println("Simple Interest = "+si);
	}
}