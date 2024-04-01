
public class excepassign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
        	//int a=100/0;
        	int b[]=new int[5];
        	b[6]=10;
        }
        catch(ArithmeticException e)
        {
        	System.out.println(e.getMessage());
        }
		catch(ArrayIndexOutOfBoundsException e)
        {
        	System.out.println(e.getMessage());
        }
        catch(NullPointerException e)
        {
        	System.out.println(e.getMessage());
        }
	}

}
