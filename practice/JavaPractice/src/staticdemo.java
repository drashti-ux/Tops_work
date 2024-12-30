//static:Constant at memory side
//no need to create object of class cause we can access static variable by class name :ex:classname.variable_name  Sdemo.s_no;
//use with variable : opposite of final

//use with method:
//1.only static members are allowed in static method
//2.all member inside Static method are static by default
//3.before static method call by class_name only but now we can call static by object also.


class Sdemo{
	int no;
	static int s_no;
	
	public static void show() {
//		no = 20; //no access
		s_no = 123; // access static member
		int r_no =678; //by default static variable
		System.out.println("s no is: "+s_no);
		System.out.println("r no is : "+r_no);
	}
}
public class staticdemo {
	public static void main(String[] args) {
		Sdemo s1 = new Sdemo();
		Sdemo s2 = new Sdemo();
		Sdemo s3 = new Sdemo();
		s1.no=1;
		s2.no=2;
		s3.no=3;
		
//		s1.show();  //call by object also
		
		Sdemo.show();
		
		s1.s_no =11;
		s2.s_no=12;
		s3.s_no = 13;
		 System.out.println("s1 no is: "+s1.no);
		 System.out.println("s2 no is: "+s2.no);
		 System.out.println("s3 no is: "+s3.no);
		 
		 System.out.println("S1 s_no is:"+s1.s_no);
		 System.out.println("S2 s_no is:"+s2.s_no);
		 System.out.println("S3 s_no is:"+s3.s_no);
	}
}
