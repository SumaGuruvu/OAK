import java.util.Scanner;
class InsufficientFundsException extends Exception
{
	InsufficientFundsException(String message)
	{
		super(message);
	}
}
public class Bank {
	Scanner sc=new Scanner(System.in);
	void deposit(int balance)
	{
		int damt=sc.nextInt();
		balance+=damt;
		System.out.println("Deposited:"+damt);
	}
	void withdraw(int balance) throws InsufficientFundsException
	{
		int wamt=sc.nextInt();
		if(wamt>balance) 
		{
			throw new InsufficientFundsException("Insufficient Balance");
		}
		else
		{
			balance-=wamt;
			System.out.println(balance);
		}
	}
	void balancecheck(int balance)
	{
		System.out.println("balance:"+balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int balance=sc.nextInt();
		Bank b=new Bank();
		b.balancecheck(balance);
		b.deposit(balance);
		try {
		b.withdraw(balance);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
