
public class Dog1 {
	String name;
	String breed;
	Dog1(String name,String breed)
	{
		this.name=name;
		this.breed=breed;
	}
	void setname(String name,String breed)
	{
		this.name=name;
		this.breed=breed;
	}
	void display()
	{
		System.out.println("Name:"+name+"\n"+"Breed:"+breed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Dog1 ob=new Dog1("Oreo","bulldog");
       Dog1 ob1=new Dog1("bujju","poodle");
       ob1.setname("pompo", "lab");
       ob.display();
       ob1.display();
       
	}

}
