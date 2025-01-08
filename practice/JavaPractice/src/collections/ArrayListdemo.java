package collections;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/*collections:  it is a collection of primitive and non (object) data types
 * 
 * class:
 * 1.ArrayList
 * 		1.it is a dynamic array
 * 		2.Automatically shrink and grow
 * 		3.default value is []
 * 		4.default size is 0
 * 		5.add( and remove() methods
 * 		6.the sequence the data is stored in that same sequence the data is displayed
 * 		7.Automatically implements list interface
 * 		8.duplicate values are allowed
 * 
 * 2.HashSet
 * 3.HashMap
 * 4.Vector
 * 5.Generic
 * 
 * Interfaces:
 * 1.List
 * 2.Set
 * 3.Map
 * 4.Iterator
 * 5.Enumeration
 * 
 */
public class ArrayListdemo {
	public static void main(String[] args) {
		List a1 = new ArrayList();
		
		System.out.println("Default Value is: "+a1);
		System.out.println("Default Size is : "+a1.size());
		
		a1.add(100);
		a1.add(25.3);
		a1.add('D');
		a1.add("Drashti");
		a1.add(new Integer(20));
		
		try {
			 Field field = ArrayList.class.getDeclaredField("elementData");
		        field.setAccessible(true);
		        Object[] internalArray = (Object[]) field.get(a1);
		        
		        // Capacity is the length of the internal array
		        System.out.println("Capacity: " + internalArray.length);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Now Value is: "+a1);
		System.out.println("Now Size is : "+a1.size());
		
		a1.add("Drashti");
		System.out.println("Now Value is: "+a1);
		System.out.println("Now Size is : "+a1.size());
		
		a1.remove(0);
		
		System.out.println("Now Value is: "+a1);
		System.out.println("Now Size is : "+a1.size());
	}
}
