//Write a program that demonstrates inheritance using extends keyword.
package Inheritance_and_Polymorphysm;
class SmartPhone{
	String Name = "SmartPhone";
	public void show() {
		System.out.println("i Am "+Name);
	}
}
class Android extends SmartPhone{
	String system = "Android";
	public void show() {
		System.out.println("I am "+Name +" which Using "+system+" system.");
	}
}
public class Lab_Q1 {
	public static void main(String [] args) {
		Android ac = new Android();
		ac.show();
	}
}
