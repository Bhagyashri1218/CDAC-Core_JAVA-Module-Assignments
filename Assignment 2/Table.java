/*16.Write a program to print table of any entered number using loop */

import java.util.Scanner;
class Table{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = sc.nextInt();
		System.out.println("Table of "+n);
		for(int i=1;i<=10;i++)
		{
			int s = n * i;
			System.out.println(s);
		}
	}
}