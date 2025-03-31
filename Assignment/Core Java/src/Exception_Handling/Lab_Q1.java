//Write a program to demonstrate exception handling using try-catch-finally.
package Exception_Handling;

import java.util.Scanner;

public class Lab_Q1 {
	int num1 ;
	int num2 ;
	int divs;
	public Lab_Q1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num1:");
		num1 = sc.nextInt();
		System.out.println("Enter Num2:");
		num2 = sc.nextInt();
	}
	void division() {
		try {
			 divs = num1/num2;
			System.out.println(num1+"/"+num2+" = "+divs);
		} catch (Exception e) {
		    System.err.println("Error: " + e.getMessage());
		}
		finally {
			System.out.println("Program ends here..");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab_Q1 d1 = new Lab_Q1();
		d1.division();
	}

}
