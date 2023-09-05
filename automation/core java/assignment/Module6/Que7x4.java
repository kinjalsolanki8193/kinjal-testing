package Module6;
/*
        1
       2 2
     3 3 3
     4 4 4 4 
 */

public class Que7x4 
{ 
	public static void main(String[] args) 
	{
		for (int i=1;i<=4;i++)
		{
			for(int j=1;j<=4-i; j++)
			{
				System.out.println(" ");
			}
			for (int s=1; s<=i;s++)
			{
				System.out.println("  "+i);
			}
			System.out.println();
		}
	}
}	
     	

