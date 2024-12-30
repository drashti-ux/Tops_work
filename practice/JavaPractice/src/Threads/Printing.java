// Write a Java program to create a basic Java thread that prints "Hello, World!" when executed.package Threads;
package Threads;
class hello extends Thread{
	public void run() {
		System.out.println("Hello!World.");
	}
}
public class Printing {
	public static void main(String[]arg) {
		hello obj = new hello();
		obj.start();
	}
}
