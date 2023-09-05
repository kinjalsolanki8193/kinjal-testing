package Module6;
/*
 W.A.J.P to create a custom exception if Customer withdraw amount
which is greater than account balance then program will show custom
exception otherwise amount will deduct from account balance.
Account balance is:2000 Enter withdraw
amount:2500
Sorry,insufficient balance,you need more 500 Rs.To perform
this transaction.
 
 */
import java.util.Scanner;

class KinjalException extends Exception
{
	double amount;
	public KinjalException(double amount)
	{
		this.amount=amount;
	}
}
class ATM
{
	double balance;
	public void deposit(double amount)
	{
		balance += amount;
		System.out.println(amount+"rs deposite....");
	}
	public void withdrawal(double amount)throws KinjalException
	{
			if(amount<=balance)
			{
				balance -= amount;
				System.out.println(amount+"rs withdrawal successfully...");
			}
			else
			{
				double needs=amount - balance;
				throw new KinjalException(needs);
			}
		}
}

public class Que27 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ATM a1=new ATM();
		System.out.println("Enter the amount of deposit...");
		double amount=sc.nextDouble();
		a1.deposit(amount);
		
		System.out.println("Enter amount for withdrawal...");
		amount=sc.nextDouble();
		try
		{
			a1.withdrawal(amount);
		}catch(KinjalException e)
		{
			System.out.println("If your enter"+e.amount+"rs more into your account then you withdrawal...");
		}
	}
}	
		
