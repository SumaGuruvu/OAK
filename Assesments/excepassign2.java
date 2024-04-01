import java.util.Scanner;
public class excepassign2 {
	class InvalidAgeException extends Exception
	{
		InvalidAgeException(String message)
		{
			super(message);
		}
	}
	void validateAge(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Age takkuva");
		}
		else
		{
			System.out.println("Saripoindi");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		excepassign2 b=new excepassign2();
		try {
		b.validateAge(age);
		}
		catch(Exception e)
		{

           System.out.println(e.getMessage());
		}
	}

}
