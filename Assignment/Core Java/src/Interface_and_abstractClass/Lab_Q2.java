//Write a program that implements multiple interfaces in a single class
package Interface_and_abstractClass;

interface Mother {
	String name ="Truptiben";
	int Age = 45;
	public void display();
	
}

interface Father{
	String name = "Jitendrabhai";
	int age = 48;
	public void display();
}

class Child implements Mother,Father{
	String name;
	int age;
	
	public void setData() {
		name = "Drashti";
		age = 22;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Child Name: "+name);
		System.out.println("Child Age: "+age);
		System.out.println(name+"'s Father Name: "+Father.name);
		System.out.println(name+"'s Father Age: "+Father.age);
		System.out.println(name+"'s Mother Name: "+Mother.name);
		System.out.println(name+"'s Mother Age: "+Mother.Age);
	}
}
public class Lab_Q2 {
	public static void main(String[]args) {
		Child c1 = new Child();
		c1.setData();
		c1.display();
	}
}
