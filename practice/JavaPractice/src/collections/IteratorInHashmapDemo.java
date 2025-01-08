package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorInHashmapDemo {
	public static void main(String[] args) {
		HashMap h1 = new HashMap();
		h1.put("Jeni","yash");
		h1.put(22, "Avi");
		h1.put("Drashti", 20);
		h1.put("avi","Drashti");
		h1.put(new Integer(10), 20);
		Set s1 =h1.entrySet();
		Iterator i1 = s1.iterator();
		
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		while(i1.hasNext()) {
			Map.Entry m1 = (Map.Entry)i1.next();
			System.out.println("Key is :"+m1.getKey());
			System.out.println("Value is : "+m1.getValue());
		}
		
		
		
	}
}
