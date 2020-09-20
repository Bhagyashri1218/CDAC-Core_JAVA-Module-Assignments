/*
11.	Write a program to swap two numbers without using third variable.
*/

import java.util.Scanner;
class SwapNo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Elements before swapping a = "+a+" b = "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Elements after swapping a = "+a+" b = "+b);
		
	}
}