import java.util.*;
public class employee2 {
	
	List<employee1> l=new ArrayList<employee1>();
	Scanner sc=new Scanner(System.in);
	void add()
	{
		System.out.println("enter the number of employees you want to enter:");
		int iterate=sc.nextInt();
		for(int i=0;i<iterate;i++) {
		employee1 e=new employee1();
		System.out.println("enter id");
		int eid=sc.nextInt();
		e.setEid(eid);
		sc.nextLine();
		System.out.println("enter name:");
		String ename=sc.nextLine();
		e.setEname(ename);
		System.out.println("enter salary:");
		float salary=sc.nextFloat();
		e.setSalary(salary);
		l.add(e);
		}
//		for(employee1 x:l)
//		{
//			System.out.println(x.getEid()+" "+x.getEname()+" "+x.getSalary());
//		}
		System.out.println("added");
	}
	void delete()
	{
		System.out.println("enter the id to delete:");
		int did=sc.nextInt();
		employee1 emp=null;
		boolean found=false;
		for(employee1 x:l)
		{
			if(x.getEid()==did)
			{
				found=true;
				emp=x;
			}
		}
		if(found) {
			l.remove(emp);
		    System.out.println("deleted");}
		else
			System.out.println("no record");
//		for(employee1 x:l)
//			System.out.println(x.getEid()+" "+x.getEname()+" "+x.getSalary());
	}
	void update()
	{
		System.out.println("enter the id to update:");
		int uid=sc.nextInt();
		sc.nextLine();
		for(employee1 x:l)
		{
			if(x.getEid()==uid) {
				System.out.println("enter name");
				String ename=sc.nextLine();
				x.setEname(ename);
			}
		}
//		for(employee1 x:l)
//			System.out.println(x.getEid()+" "+x.getEname()+" "+x.getSalary());
		System.out.println("updated");
	}
	void display()
	{
		for(employee1 x:l) {
			System.out.println("----");
			System.out.println("Id "+x.getEid()+"\n"+"Name "+x.getEname()+"\n"+"Salary "+x.getSalary());
		
	}

  }
}
