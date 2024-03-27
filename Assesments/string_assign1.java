import java.util.Scanner;

public class string_assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       String s1=sc.next();
	       String s2=sc.next();
	       String s3=sc.next();
	       StringBuilder sb=new StringBuilder(s1);
	       for(int i=0;i<s1.length();i++)
	       {
	    	   char a=s1.charAt(i);
	    	   if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U'||a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
	    		  sb.setCharAt(i, '*');
	       }
	       
	       StringBuilder sb1=new StringBuilder(s2);
	       for(int i=0;i<s2.length();i++)
	       {
	    	   char a=s2.charAt(i);
	    	   if(a!='A'&&a!='E'&&a!='I'&& a!='O'&& a!='U'&&a!='a'&&a!='e'&&a!='i'&&a!='o'&&a!='u')
	    		  sb1.setCharAt(i, '@');
	       }
	  
	       String sb3=s3.toUpperCase();
	       System.out.println(sb.append(sb1).append(sb3));
	       sc.close();
	       
	       
	}

}
