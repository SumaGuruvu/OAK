class AgeNotWithinRangeException extends Exception {
	String message;
	AgeNotWithinRangeException(String message)
	{
		super(message);
	}
}
class NameNotValidException extends Exception {
	String message;
	 NameNotValidException(String message1)
	{
		super(message1);
	}
}
public  class student  {
	
	int rollno;
	String name;
	int age;
	String course;
    
	public student(int rollno, String name, int age, String course) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	void age(int age) throws AgeNotWithinRangeException
	{
		if(age>=15 && age<=21)
		{
			
		}
		else
		{
			throw new AgeNotWithinRangeException("invalid age");
		}
	}
	void name(String name) throws NameNotValidException
	{
	char ch[]=name.toCharArray();
	for(char c:ch)
	{
		if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
				{
			
				}
		else
		{
			throw new NameNotValidException("invalid name");
		}
	}
	}
	void display()
	{
		System.out.println("rollno:"+rollno);
		System.out.println("Age:"+age);
		System.out.println("Name:"+name);
		System.out.println("Course:"+course);
	}


	 
	public static void main(String[] args) throws AgeNotWithinRangeException, NameNotValidException  {
		// TODO Auto-generated method stub
	student s=new student(1,"h_arry",12,"java");
	  s.age(s.age);
	s.name(s.name);
//    s.age(s.age);
    	
	}
}

