package Module6;

import java.util.Scanner;




public class Que8 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.   ");
		int a=sc.nextInt();
		int j,i,num,sum=0,z;
		for(j=1;j<=a;j++)
		{
			num=0;
			for (i=1;i<=j;i++)
			{
				if(j%i==0)
				{
					num++;
				}
			}
			if (num==2)
			{
				System.out.println(j+"  ");
				sum=sum+j;
			}
		}
		System.out.println();
		System.out.println(sum);
	}
}	
		
