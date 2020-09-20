/*
24.	Write a program to search an element in the array
*/
import java.util.*;

public class Search {

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("please enter no of elements:");
			
			int n=sc.nextInt();
			int arr[]=new int[n];
			System.out.println("please enter elements:");
			for(int i=0;i<=n-1;i++)
			{
				arr[i]=sc.nextInt();
			}
			
		 
			
			System.out.println("enter the no to be search:");
			int key=sc.nextInt();
			int i=0;
			
		
				while(i<n && arr[i]!=key)
					i++;
					
					if(i<n){
							System.out.println("elementfound at location:"+(i+1));
						
					}
					else
					{
							System.out.println("element not found");
					}
	
	}
}
