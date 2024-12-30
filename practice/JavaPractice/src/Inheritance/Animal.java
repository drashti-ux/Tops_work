//Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.
package Inheritance;

class Animals {
	String name;
	String sound;
	void makeSound() {
		name = "not specified";
		sound = "Unknown";
		System.out.println("The Animal is "+name+" so the sound is "+sound);
	}
}
class Cat extends Animals{
	void makeSound() {
		name = "cat";
		sound = "bark";
		System.out.println("The Animal is "+name+" so the sound is "+sound);
	}
}
public class Animal{
	public static void main(String [] args) {
		Cat c1 = new Cat();
		c1.makeSound();
	}
}