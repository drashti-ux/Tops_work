//Write a program to demonstrate exception handling using try-catch-finally.
package Exception_Handling;

import java.util.Scanner;
class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
	}
}
public class Lab_Q3 {
	int num1 ;
	int num2 ;
	int divs;
	public Lab_Q3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num1:");
		num1 = sc.nextInt();
		System.out.println("Enter Num2:");
		num2 = sc.nextInt();
	}
	void division() {
		try {
			if(num2==0) {
				throw new MyException("This Is Created by Customly");
			}
			divs = num1/num2;
			System.out.println(num1+"/"+num2+" = "+divs);
		} catch (Exception e) {
		    System.out.println("Error: "+ e );
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab_Q3 d1 = new Lab_Q3();
		d1.division();
	}

}
