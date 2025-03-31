//Lab-Q1.Write a program demonstrating single inheritance.
package OOPs_Concept;

class calc{
	int add,mul,sub;
	double num1,num2,divs;
	void Add(int n1,int n2) {
		num1 = n1;
		num2 = n2;
		 add = n1+n2;
	}
	void Sub(int n1,int n2) {
		num1 = n1;
		num2 = n2;
		 sub = n1-n2;
	}
	void Mul(int n1,int n2) {
		num1 = n1;
		num2 = n2;
		 mul = n1* n2;
	}
	void Division(double n1,double n2) {
		num1 = n1;
		num2 = n2;
		 divs = n1/n2;
	}
}
class Addition extends calc{
	 void show() {
		 System.out.println("Addition of "+num1+" and "+num2+" is : "+add);
	 }
}
public class Lab_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition ad = new Addition();
		ad.Add(5,9);
		ad.show();
	}

}
