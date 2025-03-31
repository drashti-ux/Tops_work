//Implement string comparison using equals() and compareTo() methods.
package Arrays_and_String;

import java.util.Scanner;

public class Lab_Q3 {
	void compare(String str1,String str2) {
		System.out.println("String Comparision using equals method result :"+str1.equals(str2));
		System.out.println("String Comparision using CompareTo Method Result :"+str1.compareTo(str2));
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1:");
		String str1 = sc.nextLine();
		System.out.println("Enter String 2:");
		String str2 = sc.nextLine();
		Lab_Q3 cmp = new Lab_Q3();
		cmp.compare(str1, str2);
	}
}
