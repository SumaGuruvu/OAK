class color{
	void display()
	{
		System.out.println("Color me!");
	}
}
class red extends color{
	String red(String s)
	{
		return s;
	}
	
}
class blue extends color{
	String blue(String s)
	{
		return s;
	}
}
public class inheritance_hierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       blue b=new blue();
       System.out.println(b.blue("hello bluey"));
       b.display();
       //System.out.println(b.red("hellow reddie"));//throws error
	}

}
