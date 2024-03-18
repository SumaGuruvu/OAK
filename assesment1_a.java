class assesment1_a{
	String name;
	int sid;
	String phno;
	static String course;
	 
	 assesment1_a(String name,int sid,String phno)
	 {
		 this.name=name;
		 this.sid=sid;
		 this.phno=phno;
	 }
	 static void setcourse(String coursename)
	 {
		 course=coursename;
	 }
	 void display()
	 {
		 System.out.println("Name:"+name+"\n"+"Id:"+sid+"\n"+"Phno:"+phno+"\n"+"Course:"+course+"\n");
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assesment1_a.setcourse("Java");
		assesment1_a ob=new assesment1_a("Tanjiro",524,"9356453271");
       ob.display();
       assesment1_a ob1=new assesment1_a("Zenitsu",576,"8764532787");
       ob1.display();
       
	}

}
