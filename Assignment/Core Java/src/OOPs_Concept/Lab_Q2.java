//Create a class hierarchy and demonstrate multilevel inheritance.
package OOPs_Concept;
class A{
	int a = 10;
}
class B extends  A{
	int b = 20;
}
class C extends B{
	int c = 30;
	 void show() {
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
		System.out.println("Value of c: "+c);
		System.out.println("Sum of all Three :"+(a+b+c));
	}
}
public class Lab_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj = new C();
		obj.show();
	}
}
