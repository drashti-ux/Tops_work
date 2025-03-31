//Implement a program using HashSet to remove duplicate elements from a list
package Collection_Framework;

import java.util.HashSet;

public class Lab_Q2 {
	public static void main(String[] args) {
		HashSet<String> name = new HashSet<String>();
		name.add("Drashti");
		name.add("Yash");
		name.add("Avi");
		name.add("Miti");
		name.add("Drashti");
		name.add("Jeni");
		name.add("Avi");
		
		System.out.println("Unique Names:");
		for(String names : name) {
			System.out.println(names);
		}
		
		name.remove("Drashti");
		name.remove("Jeni");
		
		System.out.println("\nAfter Removing Names:");
		System.out.println(name);
	}
}
