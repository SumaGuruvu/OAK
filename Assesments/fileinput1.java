import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class fileinput1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//       FileInputStream fis=new FileInputStream("C:\\Users\\DT052\\Documents\\sampe1.txt");
       FileReader f=new FileReader("C:\\Users\\DT052\\Documents\\sampe1.txt");
      BufferedReader f1=new BufferedReader(f);
//    int i=f1.read();

      String a=f1.readLine();
//      int n= Integer.parseInt(a);
//    System.out.println((char)n);
//    while(a!=null)
//    {
//    System.out.println(a);
//    }
	}catch(Exception e)
		{
		    System.out.println(e.getMessage());
		}

   }
}
