import java.util.Arrays;
import java.util.Scanner;
public class string_assign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String s1=sc.next();
       String s2=sc.next();
       char ch1[]=s1.toCharArray();
       char ch2[]=s2.toCharArray();
       if(s1.length()==s2.length())
       {
    	   Arrays.sort(ch1);
           Arrays.sort(ch2);
           if(Arrays.equals(ch1, ch2))
        	   System.out.println("Anagram");
           else
        	   System.out.println("Not Anagram");
     	}
       else
    	   System.out.println("Not Anagram");
       sc.close();

	}
}
