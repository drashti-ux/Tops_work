//Write a program that demonstrates the use of an ArrayList and LinkedList
package Collection_Framework;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lab_Q1 {
	public static void main(String[] args) {
//		Use Of ArrayList
		ArrayList<String> name = new ArrayList<String>();
		name.add("Drashti");   //add method to add elements into arrayList
		name.add("Avi");
		name.add("Hetal");
		name.add("Prachi");
		name.add("Yash");
		
		System.out.println("Accessing all elements in one row");
		System.out.println(name);
		
		name.remove("Prachi");   //remove method to remove element from arrayList by object
		name.remove(2);			// remove element by index
		
		System.out.println("Accessing elements One By One...");
		for(String nm : name) {
			System.out.println(nm);
		}
		
//		Use Of LinkedList
		LinkedList<Integer> r_no = new LinkedList<Integer>();
		r_no.add(22);
		r_no.add(66);
		r_no.add(42);
		r_no.add(34);
		r_no.add(68);
		
		System.out.println(r_no);
		
		r_no.remove(0);		//remove element by index
		
		for(int no : r_no) {
			System.out.println(no);
		}
	}
}
