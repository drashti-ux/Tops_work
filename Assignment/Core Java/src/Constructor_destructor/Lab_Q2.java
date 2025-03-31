//Demonstrate constructor overloading by passing different types of parameters.
package Constructor_destructor;
class calcs{

	 calcs(int n1,int n2) {
		int sum = n1+n2;
		System.out.println("Addition :"+sum);
	}
	 calcs(int n1,int n2,int n3){
		 int sum = n1+n2+n3;
			System.out.println("Addition :"+sum);
	 }
}
public class Lab_Q2 {
	public static void main(String [] args) {
		calcs ob1 = new calcs(5,4);
		calcs obj2 = new calcs(5,4,9);
	}
}
