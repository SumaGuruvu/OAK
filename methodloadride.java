class E{
	int add(int x,int y)
	{
		return x+y;
	}
}
class D extends E{
	int add(int x,int y,int z)
	{
		System.out.println(super.add(20,30));
		return x+y+z;
	}
}
public class methodloadride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        D ob=new D();
        System.out.println(ob.add(5, 10, 11));
        E ob1=new E();
        System.out.println(ob1.add(10, 20));
	}

}
