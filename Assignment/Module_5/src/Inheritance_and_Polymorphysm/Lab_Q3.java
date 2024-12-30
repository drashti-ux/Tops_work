//Use the super keyword to call the parent class constructor and methods.

package Inheritance_and_Polymorphysm;
class parent{
	String p_name;
	int age,child;
	parent(String p_name,int age,int child){
		this.p_name = p_name;
		this.age = age;
		this.child = child;
		
	}
	public void show() {
		System.out.println(p_name+" your age is "+age+" and You Have "+child+" childs");
	}
	
}
class Children extends parent{
	String name;
	int year;
	Children(String name,int years){
		super("jitendrabhai",45,2);
		this.name = name;
		year = years;
	}
	public void show() {
		super.show();
		System.out.println("Child name : "+name+" age : "+year);
	}
}
public class Lab_Q3 {
	public static void main(String [] args) {
		Children child1 = new Children("drashti",21);
		child1.show();
	}
}
