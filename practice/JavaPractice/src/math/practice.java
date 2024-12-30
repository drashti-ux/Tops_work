//Write a Java program to round up integer division results.
package math;

import java.util.Scanner;

import java.math.*;

public class practice {
	int num1,num2;
	 practice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 and num2: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		double div =(double)num1/num2;
		System.out.println("division: "+Math.round(div));
		double x = Math.copySign(25.6, -24.3);
		System.out.println(x);
		String s2 = "hello";
		System.out.println(s2.equalsIgnoreCase("hello"));
	}
	
	public static void main(String [] Args) {
		practice p1 = new practice();
	}
}
