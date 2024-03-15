class A
{
	int add(int x,int y)
	{
		return x+y;
	}
	int add(int x,int y,int z)
	{
		return x+y+z;
	}
}
public class methodoverloading {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
       A ob=new A();
       System.out.println(ob.add(2,3,4));
       System.out.println(ob.add(10,56));
	}

}
