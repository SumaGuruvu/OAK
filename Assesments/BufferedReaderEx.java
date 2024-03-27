import java.io.*;
public class BufferedReaderEx {
	void display(user a[]) {
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
//			System.out.print("Name"+name);
//			System.out.print("Salary"+salary);
//			System.out.print("age"+age);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		user a[]=new user[5];
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       for(int i=0;i<5;i++)
       {
    	   try {
    		   
    	   System.out.println("Enter Name");
    	   String name=br.readLine();
    	   System.out.println("Enter Age:");
    	   int age=Integer.parseInt(br.readLine());
    	   System.out.println("Enter Salary:");
    	   Float salary=Float.parseFloat(br.readLine());
    	   a[i]=new user(name,salary,age);
    	   }
    	   catch(Exception e)
    	   {
    		   e.printStackTrace();
    	   }
    	  
    	
       }
       BufferedReaderEx ob=new BufferedReaderEx();
       ob.display(a);
     
	}
	  
}
