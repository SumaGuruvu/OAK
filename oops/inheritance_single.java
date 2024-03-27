class Animal{
	void print()
	{
		System.out.println("Hello welcome");
	}
}
class Dog extends Animal
{
	void print()
	{
	    super.print();
		System.out.println("hello its doggie");
	}
}
public class inheritance_single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Dog ob=new Dog();
           ob.print();
	}

}
