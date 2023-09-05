package Module6;
/*
  1
 01
 101
 01010
 101010 
 */

public class Que7x3 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5; i++)
		{
			for(int j=i; j>=1;j--)
				System.out.println(j%2);
		}
		System.out.println();
	}
}

