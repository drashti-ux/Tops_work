//Write a program to find if a number is even or odd using an if-else statement

package Control_Flow_Statements;

import java.util.Scanner;

public class Lab_Q1 {
	public static void main(String [] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		num = sc.nextInt();
		if(num%2 == 0) {
			System.out.println("The Number "+num+" is Even");
		}
		else {
			System.out.println("The Number "+num+" is Odd");
		}
	}
}
