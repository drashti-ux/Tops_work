package collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v2 = new Vector();  
		// its default capacity is 10 if it exieds the capacity (more than 10) than it double the capacity   
		
		Vector v1 = new Vector(5,1);   
		// its capacity is 5 if it exieds the capacity(more than 5) than it increase the capacity one by one
		
		System.out.println("default size is :"+v1.size());
		System.out.println("Default value is :"+v1);
		System.out.println("Default Capacity: "+v1.capacity());
		
		v1.add(20);
		v1.add("Drashti");
		v1.add(22);
		v1.add("avi");
		v1.add("Yash");
		v1.add(new Integer (04));
		
		System.out.println("Now size is :"+v1.size());
		System.out.println("Now value is :"+v1);
		System.out.println("Now Capacity: "+v1.capacity());
		
		
		Enumeration e1 = v1.elements();
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
			
		}
		
	}
}
