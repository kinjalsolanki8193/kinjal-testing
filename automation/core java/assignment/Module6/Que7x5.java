package Module6;
/*
 * 
 * 
 * 
 * 
 * 
 */
public class Que7x5 
{
	public static void main(String[] args) 
	{
		for (int i=1; i<=4;i++)
		{
			for (int j=1;j<=4-i;j++)
			{
				System.out.println("  ");
			}
			for (int j=1; j<=i;j++)
			{
				System.out.println("   "+ "*");
			}
			System.out.println();
		}
		for (int i=3; i>=1; i--)
		{
			for (int j=1; j>=i-2; j--)
			{
				System.out.println("    ");
			}
			for (int k=1; k<=i; k++)
			{
				System.out.println("  "+"+");
			}
		}
	}	
		
	}

}
