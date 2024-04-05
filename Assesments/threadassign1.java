import java.util.Scanner;
class threadassign1 implements Runnable{
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
	       for(int i=0;i<a.length;i++)
	       {
	    	   a[i]=sc.nextInt();   
	       }
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       threadassign1 b=new threadassign1();
       Thread t=new Thread(b);
       t.start();
       
	}


}

