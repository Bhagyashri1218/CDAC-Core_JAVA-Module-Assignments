/*
17.	Write a program to reverse a given number.
*/
import java.util.Scanner;
class Reverse{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number for reverse = ");
		int n = sc.nextInt();
		int rev = 0;
		while(n!=0)
		{
			rev = rev * 10;
			rev = rev + n%10;
			n = n/10;
		}
		System.out.println("Reverse Number = "+rev);
	}
}