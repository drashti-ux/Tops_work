package collections;

import java.util.HashSet;
import java.util.Iterator;

/*
 * Iterator : when there is need to display data into list rather than  [] we use iterator
 * 	1.assign all the value to the iterator from object
 * 	2.Traverse the lit of the value
 * 	3.get value from the iterator
 */
public class IteratorDemo {
	public static void main(String[] args) {
		HashSet h1 = new HashSet();
		
		System.out.println("Default value is :"+h1);
		System.out.println("default size is: "+h1.size());
		
		h1.add(100);
		h1.add('D');
		h1.add(25.3);
		h1.add("Drasti");
		h1.add(new Integer(10));
		
		System.out.println("Now value is :"+h1);
		System.out.println("Now size is: "+h1.size());
		
		h1.add("Drasti");
		System.out.println("Now value is :"+h1);
		System.out.println("Now size is: "+h1.size());
		
		h1.remove(25.3);
		System.out.println("Now value is :"+h1);
		System.out.println("Now size is: "+h1.size());
		
		Iterator i1 = h1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}
}
