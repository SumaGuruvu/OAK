
 abstract class Bank{
	void display()
	{
		System.out.println("Rate of interest");
	}
	 abstract int getRateOfIntrst();
}
 class SBI extends Bank
 {
	 int getRateOfIntrst()
	 {
		 return 7;
	 }
 }
 class Union extends Bank
 {
	 int getRateOfIntrst()
	 {
		 return 8;
	 }
 }
 class Punjab extends Bank
 {
	 int getRateOfIntrst()
	 {
		 return 9;
	 }
 }

 public class asbtraction1 {
 public static void main(String[] args) {
		// TODO Auto-generated method stub
         SBI ob=new SBI();
         System.out.println(ob.getRateOfIntrst());
         Union ob1=new Union();
         System.out.println(ob1.getRateOfIntrst());
         Punjab ob2=new Punjab();
         System.out.println(ob2.getRateOfIntrst());
         
      }
 }

