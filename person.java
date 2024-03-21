public class person {
	String name;
	int age;
	person(String name,int age)
	{
		this.age=age;
		this.name=name;
	}
	void display()
	{
		System.out.println("Name:"+name+"\n"+"Age:"+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      person ob=new person("zack",12);
      person ob1=new person("cody",12);
      ob.display();
      ob1.display();
     }

}
