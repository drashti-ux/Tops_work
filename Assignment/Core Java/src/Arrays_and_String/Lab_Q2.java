//Create a program to reverse a string and check for palindromes.
package Arrays_and_String;

import java.util.Scanner;

public class Lab_Q2 {
	
	void IsPalindrom(String str) {
		
		String reversed = "";
	    for (int i = str.length() - 1; i >= 0; i--) {
	        reversed += str.charAt(i);
	    }
		if(str.equals(reversed)) {
			System.out.println("The Given String "+str+" is palindrom");
		}
		else {
			System.out.println("The Given String "+str+" is not Plaindrom");
		}
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Any String :");
		String str = sc.nextLine();
		
		Lab_Q2 s = new Lab_Q2();
		s.IsPalindrom(str);
	}
}
