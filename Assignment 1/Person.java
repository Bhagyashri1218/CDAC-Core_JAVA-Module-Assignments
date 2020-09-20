/*
15.	Accept person’s gender (character m for male and f for female), age (integer), as input and then check whether person is eligible for marriage or not.
*/

import java.util.Scanner;
class Person{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter gender");
		char c = sc.next().charAt(0);
		System.out.println("Enter Age");
		int age = sc.nextInt();
		if(c == 'f' && age>=18)
		{
			System.out.println("You are Eligible for marriage");
		}
		else if(c == 'm' && age>=21)
		{
			System.out.println("You are eligible for marriage ");
		}
		else
		{
			System.out.println("You are not Eligible");
		}
	}
}