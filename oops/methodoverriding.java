class B
{
	void sub(int x,int y)
	{
		System.out.println(x-y);
	}
}
class C extends B
{
	void sub(int a,int b)
	
	{
		super.sub(30, 20);
		System.out.println(((a*a)-(b*b)));
	}
}
public class methodoverriding {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
       C ob1=new C();
       ob1.sub(2,3);
       B ob2=new B();
       ob2.sub(10, 5);
	}

}

