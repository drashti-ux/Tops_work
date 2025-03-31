//Implement runtime polymorphism by overriding methods in the child class
package Inheritance_and_Polymorphysm;

import java.util.Scanner;

class shape{
	String shape_name;
	double area;
	Scanner sc = new Scanner(System.in); 
	shape(){
		System.out.println("Enter Shapename:");
		shape_name = sc.nextLine();
	}
}
class circle extends shape{
	int redious;
	double Pi = 3.14;
	void getData() {
		if(shape_name.equals("circle")) {
			System.out.println("Enter recious of the circle");
			redious = sc.nextInt();
		}	
	}
	void getArea() {
		area = Pi*redious*redious;
		System.out.println("Area of the "+shape_name+" : "+area);
	}
}
public class Lab_Q2 {
	public static void main(String [] args) {
		circle c1 = new circle();
		c1.getData();
		c1.getArea();
	}
}
