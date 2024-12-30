//Lab-Q3.Write a program to display the Fibonacci series using a loop.

package Control_Flow_Statements;

import java.util.Scanner;

public class Lab_Q3 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number of terms You want in fibonaci Series: ");
		int terms = sc.nextInt();
		int first = 0;
		int second = 1;
		int next;
		if(terms>0) {
			System.out.print(first+" ");
			if(terms>1) {
				System.out.print(second+" ");
				for(int i = 3;i<=terms;i++) {
					next = first + second;
					first = second;
					second = next;
					System.out.print(next+" ");
				}
			}
		}
		
	}
}
