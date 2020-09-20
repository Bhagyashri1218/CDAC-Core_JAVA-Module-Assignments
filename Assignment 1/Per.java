/*Write a program to calculate sum of 5 subject’s marks & find percentage. Take the obtained marks from user using Scanner class. Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here.*/

import java.util.Scanner;
class Per{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks of % subject");
		int marks[]=new int[5];
		for(int i = 0; i<5 ;i++){
			marks[i]=sc.nextInt();
		}
		int sum=0;
		for(int i = 0; i<5 ;i++){
			sum=sum+marks[i];
		}
		System.out.println("Sum of marks = "+sum);
		
		double per = sum / 5;
		System.out.println("percentage of marks = "+per+" %");
	}
}