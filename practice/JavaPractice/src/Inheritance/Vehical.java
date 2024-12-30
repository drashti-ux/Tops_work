//Write a Java program to create a class called Vehicle with a method called drive(). 
//Create a subclass called Car that overrides the drive() method to print "Repairing a car".
package Inheritance;

class vehicals{
	void drive() {
		System.out.println("Repairing the vehicals..");
	}
}
class Car extends vehicals{
	void drive() {
		System.out.println("Repairing the car..");
	}
}
public class Vehical {
	public static void main(String []args) {
		Car c1 =new Car();
		c1.drive();
	}
}
