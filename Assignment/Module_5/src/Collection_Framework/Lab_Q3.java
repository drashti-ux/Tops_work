//Create a HashMap to store and retrieve key-value pairs.
package Collection_Framework;

import java.util.HashMap;
import java.util.Map;

public class Lab_Q3 {
	public static void main(String[] args) {
		Map<Integer, String> students = new HashMap<Integer, String>();
		students.put(33, "Drashti");
		students.put(26, "diya");
		students.put(43, "Priya");
		students.put(41, "Tulsi");
		students.put(35, "Priyanshi");
		
//		System.out.println(students);
		
		for(int roll_no : students.keySet() ) {
			System.out.println(roll_no+" : "+students.get(roll_no));
		}
	}
}

