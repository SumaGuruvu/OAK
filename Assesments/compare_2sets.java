import java.util.*;
public class compare_2sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Set<String> s=new TreeSet<String>();
     s.add("hello");
     s.add("its");
     s.add("nothing");
     Set<String> s1=new TreeSet<String>();
     s1.add("hello");
     s1.add("its");
     s1.add("nothing");
     boolean flag=false;
     if(s.equals(s1))
     {
    	flag=true;
     }
     else
     {
    	 flag=false;
     }
     System.out.println(flag);
	}

}
