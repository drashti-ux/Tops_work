package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queuedemo {
	public static void main(String[] args) {
		Queue<String> q1 = new LinkedList<String>();
		q1.add("Drashti");
		q1.add("prachi");
		q1.add("hetal");
		q1.add("Jeni");
		
		System.out.println(q1);
		System.out.println("Peak element: "+q1.peek());  //to peek element
		System.out.println(q1);
		System.out.println("Poll element: "+q1.poll());  //to remove element
		System.out.println(q1);
	}
}
