import java.util.Scanner;
public class Rectangle {
	int height;
	int width;
	Rectangle(int height,int width)
	{
		this.height=height;
		this.width=width;
	}
	void area()
	{
		double area=height*width;
		System.out.println(area);
	}
	void perimeter()
	{
		double perimeter=2*(height+width);
		System.out.println(perimeter);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Rectangle ob=new Rectangle(10,20);
		ob.area();
		ob.perimeter();
		sc.close();
	}

}
