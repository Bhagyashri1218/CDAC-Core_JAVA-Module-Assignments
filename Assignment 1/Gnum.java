/*
13.	Program to find greatest in 3 numbers. [ once using if else statement and then using ternary operator ( logical operator) ]  
*/
import java.util.Scanner;
class Gnum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a > b)
		{
			if(a > c){
				System.out.println("a is greater");
			}
			else{
				System.out.println("c is greater");
			}
		}
		else if(b > c){
			System.out.println("b is greater");
		}
		else{
			System.out.println("c is greater");
		}
		
		
		System.out.println("Using Ternary Operator");
		int greater = (a > b)?(( a > c)? a :c) :((b > c)? b:c);
		System.out.println(greater);
		
	}
}