package Module6;

import java.util.Scanner;

// W.A.J.P take no from user and print the greatest no
public class Que1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b ");
		int b=sc.nextInt();
		System.out.println("Enter the value of c ");
		int c=sc.nextInt();
		
		if (a>b && a>c)
		{
			System.out.println("a is the greatest");
		}
		else if (b>a && b>c)
		{
			System.out.println("b is the greatest");
		}
		else if (c>a &&c>b)
		{
			System.out.println("c is the greatest");
		}
		else if (a==b && a==c)
		{
			System.out.println("all are equal");
		}
		else
		{
			System.out.println("two are the greatest");
		}
	}
}	
		