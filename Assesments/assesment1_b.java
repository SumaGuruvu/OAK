public class assesment1_b {
	String name;
	float salary;
	int hiredate;
	assesment1_b(String name,float salary,int hiredate)
	{
		this.name=name;
		this.salary=salary;
		this.hiredate=hiredate;
	}
	int yearsofservice(int hiredate)
	{
		return 2024-hiredate;
	}
	void display()
	{
		int service=yearsofservice(hiredate);
		if(service<2)
		{
			System.out.println("Temporary Employee");
			System.out.println("Name:"+name+"\n"+"Salary:"+salary+"\n"+"Service:"+service+"\n");
		}
		else {
			System.out.println("Permanent Employee");
		System.out.println("Name:"+name+"\n"+"Salary:"+salary+"\n"+"Service:"+service+"\n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        assesment1_b ob=new assesment1_b("Inosuke",5000.00f,2000);
        ob.display();
        assesment1_b ob1=new assesment1_b("Nezuko",4500.0f,2023);
        ob1.display();
        
	}

}
