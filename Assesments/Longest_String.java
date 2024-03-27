import java.util.Scanner;
public class Longest_String {                

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           String s1=sc.nextLine();
           String a[]=s1.split(" ");
           int temp=0;
           for(int i=0;i<a.length;i++)
           {
        	   for(int j=i+1;j<a.length;j++)
        	   {
        		   if(a[i].length()>a[j].length()&&a[i].length()>temp)
        			   temp=a[i].length();
        		   else if(a[j].length()>temp)
        			   temp=a[j].length();
        	   }
           }
           System.out.println(temp);
           sc.close();
	   }
	}
