//Create multiple constructors in a class and demonstrate constructor overloading

package Classes_and_Objects;
class Add{
	int sum;
	void Add(int num1,int num2) {
		sum = num1 + num2;
		System.out.println("Addition of Two Numbers : "+sum);
	}
	void Add(int num1,int num2,int num3) {
		sum = num1 + num2 + num3;
		System.out.println("Addition of Three Numbers :"+sum);
	}
	void Add(int num1,int num2,int num3,int num4) {
		sum = num1+num2+num3+num4;
		System.out.println("Addition of Four Numbers: "+sum);
	}
	void add(int num1,int num2,int num3,int num4,int num5) {
		sum = num1+num2+num3+num4+num5;
		System.out.println("Addition of Five Numbers:"+sum);
	}
}
public class Lab_Q2 {
	public static void main(String [] args) {
		Add sum = new Add();
		sum.Add(5,4);
		sum.Add(14, 11,17);
		sum.Add(78, 12, 63, 73);
		sum.add(54, 65, 71, 1, 60);
	}
}
