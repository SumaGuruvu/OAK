interface hero1
{
	void show();
}
class heroine123 implements hero1{
	public void show()
	{
		System.out.println("im here");
	}
}
public class hero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		heroine123 ob=new heroine123();
		ob.show();

	}

}
