interface interface2 {
	void print();
}
interface interface3{
	void show();
}
class student implements interface2,interface3
{
	public void print()
	{
		System.out.println("Salary is: 10,1000 ");
	}
	public void show()
	{
		System.out.println("lives in hyderabad");
	}
}
/*class student1 implements interface2
{
	public void show()
	{
		System.out.println("lives in vizag");
	}
	public void print()
	{
		System.out.println("salary is 20,200");
	}
}*/
class interface1
{
	public static void main(String args[])
	{
		student ob=new student();
		student ob1=new student();
		ob.print();
		ob.show();
		ob1.print();
        ob1.show();		
	}
}