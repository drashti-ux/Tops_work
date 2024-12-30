//Implement method overloading by creating methods for different data types.
package Methods_in_Java;
class Meth_overload{
	
	int Add(int num1,int num2) {
		int sum = num1 + num2;
		return sum;
	}
	double Add(double num1,double num2) {
		double sum = num1 + num2;
		return sum;
	}
	void Add(int num1,double num2) {
		System.out.println("Addition of two number :"+(num1+num2));
	}
}
public class Lab_Q2 {
	public static void main(String [] args) {
		Meth_overload m1 = new Meth_overload();
		System.out.println("Addition of two Integers :"+m1.Add(9, 7));
		System.out.println("Addition of Two Real numbers : "+m1.Add(9.2, 7.5));
		m1.Add(8, 9.4);
		
	}
}
