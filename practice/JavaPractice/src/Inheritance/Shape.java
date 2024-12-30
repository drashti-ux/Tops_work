package Inheritance;

import java.util.Scanner;

class Shapes{
	String name = "shape";
	double area = 0;
	void getArea() {
		System.out.println(name+" : " +area);
	}
}
class Triangle extends Shapes{
	Scanner sc = new Scanner(System.in);
	double half =0.5;
	int base,side;
	void calculateArea() {
		area = half * side * base;
	}
	void getArea() {
		name = "Triangle";
		System.out.println("Enter The value of Base and Side:");
		base = sc.nextInt();
		side = sc.nextInt();
		this.calculateArea();
		System.out.println(name+" : " +area);
	}
}
public class Shape {
	public static void main(String [] args) {
		Triangle t1 = new Triangle();
		t1.getArea();
		
	}
}
