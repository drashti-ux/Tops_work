//Lab-Q1.Create a class Student with attributes (name, age) and a method to display the details.
package Classes_and_Objects;

import java.util.Scanner;

class Student {
	String name;
	int age;

	Scanner sc = new Scanner(System.in);
	void getInfo() {
		System.out.print("Enter Student name:");
		name = sc.nextLine();
		System.out.print("Enter Age of student:");
		age = sc.nextInt();
	}
	void display() {
		System.out.println("--Student Information--");
		System.out.println("Student name : "+name);
		System.out.println("Student age : "+age);
	}
}
public class Lab_Q1{
	public static void main(String [] args) {
		Student s1 =new Student();
		s1.getInfo();
		s1.display();
	}
	
}