//Create a user-defined package and import it into another program.
package Package_and_Access_specifiers;

import Datatypes_Variables_Operators.Hello;

public class Lab_Q1 {
	public static void main(String [] args) {
		System.out.println("Imported Other Package Info:");
		
		Hello h1 = new Hello();
		System.out.println(h1.getClass());
		
		System.out.println("\nOutput:");
		Hello.main(args);
		
	}
}
