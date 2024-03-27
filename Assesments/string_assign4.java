import java.util.Scanner;
public class string_assign4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String s1="Geeks Gor Geeks";
      int index = 6;
      char ch = 'F';
      s1=s1.substring(0, index)+ch+
    		  s1.substring(index + 1);
      System.out.println(s1);
      sc.close();
	}

}