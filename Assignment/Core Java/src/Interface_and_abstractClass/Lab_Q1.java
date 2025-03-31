//Create an abstract class and implement its methods in a subclass.
package Interface_and_abstractClass;

import java.util.Scanner;

abstract class School{
	int r_no;
	String name;
	abstract void display();
}
class Div_A_stud extends School{
	
	Scanner sc = new Scanner(System.in);
	public void setdata() {
		System.out.println("Enter Roll No:");
		r_no = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name: ");
		name = sc.nextLine();
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("\n--Student info--");
		System.out.println("Roll_no: "+r_no);
		System.out.println("Name :"+name);
	}
	
}
public class Lab_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Div_A_stud a = new Div_A_stud();
		a.setdata();
		a.display();
	}

}
