//Demonstrate the use of different access modifiers within the same package and across different packages
package Package_and_Access_specifiers;

import Datatypes_Variables_Operators.Lab_Q1;

class Modifiers{
	String Name ="drashti";  //default variable
	private double salary = 25000; //private variable
	protected long Mobile_no = 1234567890l;  //protected variable
	public String city = "valsad";  //public variable
	public Modifiers() {
		System.out.println("In Same Class:\n");
		System.out.println("1.Default Variable Name: "+Name);
		System.out.println("2.Protected Variable Mobile Number: "+Mobile_no);
		System.out.println("3.Private Variable Salary: "+salary);
		System.out.println("4.Public Variable City: "+city);
	}
}

class Modifiers1 extends Modifiers{
	
	Modifiers1(){
		System.out.println("\n");
		System.out.println("In Other Class which Extends Modifier class Within The Same Package:\n");
		System.out.println("Default Variable Name: "+Name);
		System.out.println("Protected Variable Mobile Number: "+Mobile_no);
//		System.out.println("Salary: "+salary);  
		System.err.println("Private Variable Salary:  Can Not Access");
		System.out.println("Public Variable City: "+city);
	}
}

class Modifiers2{
	Modifiers2(){
		Lab_Q1 l1 = new Lab_Q1();
		System.out.println("\n");
		System.out.println("In Different Package Without Extending Class:\n");
//		System.out.println("Name: "+l1.Name);
		System.err.println("Default Variable Name: Can Not Access");
//		System.out.println("Mobile_No: "+l1.Mobile_no);
		System.err.println("Protected Variable Mobile Number: Can Not Access");
//		System.out.println("Salary : "+l1.Salary);
		System.err.println("Private Variable Salary:  Can Not Access ");
		System.out.println("Public Variable City: "+l1.city);
	}
}

class Modifiers3 extends Lab_Q1{
	Modifiers3(){
		System.out.println("\n");
		System.out.println("In Different Package With Extending Class:\n");
//		System.out.println("Name: "+Name);
		System.err.println("Default Variable Name: Can Not Access");
		System.out.println("Protected Variable Mobile Number: "+Mobile_no);
//		System.out.println("Salary : "+Salary);
		System.err.println("Private Variable Salary:  Can Not Access");
		System.out.println("Public Variable City: "+city);
	}
}
public class Lab_Q2 {
	public static void main(String [] args) {
		
		new Modifiers1();
		new Modifiers2();	
		new Modifiers3();
	}
}
