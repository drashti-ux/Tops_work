package collections;

import java.util.HashSet;

// Generic :generic are used to generalize the object
// for ex: ArrayList <Integer> --> it generalize that the arrayList Contains the Integer values only

public class Generacis_demo {
	public static void main(String[] args) {
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(10);
		h1.add(0);
		h1.add(40);
		h1.add(20);
		
		System.out.println("To print as an array:");
		System.out.println(h1);
		
		System.out.println("\nTo print in single line as list");
		for(int i : h1) {
			System.out.println(i);
		}
	}
}
