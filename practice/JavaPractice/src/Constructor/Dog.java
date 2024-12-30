//Parameterized Constructor:
//Write a Java program to create a class called Dog with instance variables name and color. Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables. Print the values of the variables.

package Constructor;

public class Dog {
	String name,color;
		Dog(String D_name,String D_color){
			name = D_name;
			color = D_color;
		}
		void display() {
			System.out.println("Dog Name : "+name);
			System.out.println("Dog Color : "+color);
		}
	public static void main(String [] args) {
		Dog d1 =new Dog("Bunny","Black");
		d1.display();
	}
}
