// Default Constructor:
//Write a Java program to create a class called "Cat" with instance variables name and age. Implement a default constructor that initializes the name to "Unknown" and the age to 0. Print the values of the variables.
package Constructor;

public class Cat {
	String name;
	int age;
	Cat(){
		 name = "Unknown";
		 age = 0;
		
	}
	void display() {
		System.out.println("Cat Name : "+name);
		System.out.println("Cat Age : "+age);
	}
	public static void main(String [] args) {
		Cat c1 = new Cat(); 
		c1.display();
	}
}
