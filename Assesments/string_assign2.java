import java.util.Scanner;
public class string_assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      String s2=sc.next();
      boolean b=false;
      String x[]=s1.split(" ");
      for(String i:x)
      {
    	  if(i.equals(s2)) {
    		  b=true;
    	      break;
    	  }
      }
      System.out.println(b);
      sc.close();
	}
   
}
