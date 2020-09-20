/*
Write a program that takes user’s name as command line argument and prints Welcome <entered user name>.
*/

class CmdU{
	public static void main(String args[])
	{
			String s1 = args[0];
			System.out.println("Welcome "+s1);
	}
}