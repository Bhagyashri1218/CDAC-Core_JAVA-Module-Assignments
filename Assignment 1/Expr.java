/*
03.	Find the result of following expressions. You need to determine the primitive data type of the variable by looking carefully the given expression and initialize variables by any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]

*/

class Expr{
	
	public static void main(String args[]){
		int x=2;
		int y = x^2 + 3 * x -7;
		System.out.println("y = "+y);
		
		y = x++ + ++x;
		System.out.println("x = "+x+" y = "+y);
		
		int z = x++ - --y - --x + x++;
		System.out.println("x = "+x+" y = "+y+" z = "+z);
		
		boolean x1=true,y1=false,z1;
		z1 = x1 && y1 || !(x1 || y1);
		System.out.println("z1 = "+z1);
	}
}