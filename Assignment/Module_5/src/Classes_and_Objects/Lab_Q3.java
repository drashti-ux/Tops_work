//Implement a simple class with getters and setters for encapsulation

package Classes_and_Objects;

import java.util.Scanner;

class Employee{
	private int age;
	private String name;
		Scanner sc = new Scanner(System.in);
		
		public void setter() {
			System.out.print("Enter Employee Name :");
			name = sc.nextLine();
			System.out.print("Enter Employee Age :");
			age =sc.nextInt();
		}
		public void getter() {
			System.out.println("--Employee Info--");
			System.out.println("Name :"+name);
			System.out.println("Age :"+age);
		}
	
}
public class Lab_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(); 
		emp.setter();	
		emp.getter();
	}

}
