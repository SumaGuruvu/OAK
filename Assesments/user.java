
public class user extends Object{
  
	String name;
	float salary;
	int age;
	user(String name,float salary,int age)
	{
		this.name=name;
		this.salary=salary;
		this.age=age;
	}
	  public String toString() {
   	   return this.name+" "+this.salary+" "+this.age;
      }
}
