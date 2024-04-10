import java.util.*;
import java.util.Scanner;
public class listtoarrayassign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       List<Integer> al=new ArrayList<Integer>();
       al.add(10);
       al.add(20);
       al.add(30);
       System.out.println(al);
       int a[]=new int[al.size()];
       for(int i=0;i<al.size();i++)
       {
    	   a[i]=al.get(i);
       }
       for(int i=0;i<al.size();i++)
       {
    	   System.out.println(a[i]);
    	   
       }
       
	}

}
