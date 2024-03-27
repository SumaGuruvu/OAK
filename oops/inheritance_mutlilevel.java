class add{
	int add(int x,int y)
	{
		return x+y;
	}
}
class sub extends add{
  int sub(int x,int y)
  {
	//super.add(25, 75);
	  System.out.println(super.add(25, 75));
	  return x-y;
  }
}
class mul extends sub{
   int mul(int x,int y)
   {
	   return x*y;
   }
}
public class inheritance_mutlilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        add a=new add();
        System.out.println(a.add(67, 3));
        System.out.println(a.add(30, 50));
        sub b=new sub();
        System.out.println(b.sub(70,5));
        mul m=new mul();
        System.out.println(m.add(7, 9));
	}

}
