import java.util.Scanner;
public class employee3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        employee2 e=new employee2();
        boolean result=true;
        while(result)
        {
        	System.out.println("please choose 1 to add 2 to delete 3 to update 4 to display and 5 to exit:");
        	int choice=sc.nextInt();
        	switch(choice)
        	{
        	case 1:e.add();
        	break;
        	case 2:e.delete();
        	break;
        	case 3:e.update();
        	break;
        	case 4:e.display();
        	break;
        	default: 
        		System.out.println("Done!");
        		result=false;
        	}
        }
	}

}
