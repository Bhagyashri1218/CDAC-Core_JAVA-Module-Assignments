/*
Write a program that takes radius of a circle as input. Read the entered radius using Scanner class. Then calculate and print the area and circumference of the circle.
*/

import java.util.Scanner;
class Circle{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius ");
		int r = sc.nextInt();
		
		double area = 3.14 * r * r;
		System.out.println("Area of circle = "+area);
	
		double circ = 2 * 3.14 * r;
		System.out.println("Circumference = "+circ);
	}
}