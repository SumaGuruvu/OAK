
public class assesment1_d {
	String name;
	double salary;
	int noofhours;
	assesment1_d(String name,double salary,int noofhours)
	{
		this.name=name;
		this.salary=salary;
		this.noofhours=noofhours;
	}
	void getInfo()
	{
		System.out.println("Name:"+name+"\n"+"Salary:"+salary+"\n"+"NoOfHours:"+noofhours);
		System.out.println();
	}
	void Addsal()
	{
		if(salary<5000)
			salary=salary+1000;
	}
	void Addwork()
	{
		if(noofhours>6)
			salary=salary+500;
	}
	void display()
	{
		
		System.out.println("Name:"+name+"\n"+"Salary:"+salary+"\n"+"NoOfHours:"+noofhours);
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assesment1_d ob=new assesment1_d("cody",2000d,8);
		ob.getInfo();
		System.out.println("After bonus");
		ob.Addsal();
		ob.Addwork();
		ob.display();
	
		
		
	}

}
