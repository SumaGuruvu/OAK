
public class assesment1_c {
	String name;
	int yearofjoining;
	double salary;
	String address;
	assesment1_c(String name,int yearofjoining,double salary,String address)
	{
		this.name=name;
		this.yearofjoining=yearofjoining;
		this.salary=salary;
		this.address=address;
	}
	void display()
	{
		System.out.println(name+"   "+ yearofjoining+"             "+salary+"      "+address);
		System.out.println();
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       assesment1_c ob=new assesment1_c("Ramesh",1994,37500.75,"64C- James Street");
       assesment1_c ob1=new assesment1_c("Sandeep",2000,42750.85,"68D- Bank Street");
       assesment1_c ob2=new assesment1_c("Sandhya",1999, 38785.25,"26B- Temple Lane");
       System.out.println("Name  "+"   YearOfJoining  "+"  Salary "+"     Address");
       ob.display();
       ob1.display();
       ob2.display();
	}

}
