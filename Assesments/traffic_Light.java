public  class traffic_Light{
	String color;
	int duration_red=50;
	int duration_green=30;
	void change_color(String color )
	{
		if(color=="green")
			System.out.println("green"+" "+duration_green);
		else if(color=="red")
			System.out.println("red"+" "+duration_red);
	}
		
	public static void main(String args[])
	{
		traffic_Light ob=new traffic_Light();
		System.out.println("Color "+"Duration");
		ob.change_color("green");
		ob.change_color("red");
	}
}
