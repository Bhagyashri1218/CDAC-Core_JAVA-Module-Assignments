/*
09.	Write a program to read the days (eg. 670 days) as integer value using Scanner class. Now convert the entered days into complete years, months and days and print them.
*/


import java.util.Scanner;
class Days{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of days");
		int day = sc.nextInt();
		
		int years = day/365;
		int days = day%365;
		int months = days/30;
		int rdays = days%30;
		
		System.out.println("years = "+years+ " months ="+months+ " Days = "+rdays);
	}
}