import java.util.Scanner;
public class excepassign3 {
	int a;
	class oddException extends Exception
	{
		oddException(String message){
		super(message);
		}
	}
	void numberodd(int a) throws oddException
	{
		if(a%2!=0)
    	{
    		throw new oddException("odd number");
    	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        excepassign3 b=new excepassign3();
        try {
        	b.numberodd(a);
        	
        }catch(Exception e)
        {
        	System.out.println(e.getMessage());
        }
	}

}
