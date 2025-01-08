package collections;

import java.util.HashMap;
/*
 * hashMap:
 * 	1.It is Dynamic Array
 * 	2.Automatically shrink and grow
 * 	3.Default value is {}
 * 	4.Default size is 0
 * 	5.Put() and remove() methods
 * 	6.it has pair <k,v>(key,value)
 * 	7.Hash key are converted to hash code and values are stored hash code wise
 * 	8.All pair has its own hash key
 * 	9.Automatically implements Map Interface
 * 	10.duplicate keys are not allowed
 */
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap h1 = new HashMap();
		
		System.out.println("Default Value is :"+h1);
		System.out.println("Default Size is : "+h1.size());
		
		h1.put("Drashti","patel");
		h1.put(22, "diya");
		h1.put(26, 86);
		h1.put("Riya",99);
		
		System.out.println("\n putting the elements:");
		System.out.println("Default Value is :"+h1);
		System.out.println("Default Size is : "+h1.size());
		
		h1.put(22,"kinal");
		System.out.println("\nput element with duplicate key:");
		System.out.println("Default Value is :"+h1);
		System.out.println("Default Size is : "+h1.size());
		
		h1.put("hiyu", 86);
		System.out.println("\nput element with duplicate value");
		System.out.println("Default Value is :"+h1);
		System.out.println("Default Size is : "+h1.size());
		
		h1.remove(26);
		System.out.println("\nRemoving element");
		System.out.println("Default Value is :"+h1);
		System.out.println("Default Size is : "+h1.size());
		
	}
}
