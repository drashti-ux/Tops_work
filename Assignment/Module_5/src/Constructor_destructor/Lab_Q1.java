//Write a program to create and initialize an object using a parameterized constructor.
package Constructor_destructor;
class calc{

	 calc(int n1,int n2) {
		int sum = n1+n2;
		System.out.println("Addition :"+sum);
	}
}
public class Lab_Q1 {
	public static void main(String [] args) {
		calc ob = new calc(5,4);
	}
}
