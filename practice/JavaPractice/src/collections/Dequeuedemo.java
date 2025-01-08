package collections;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeuedemo {
	public static void main(String[] args) {
		Deque<String> dq = new LinkedList<String>();
		dq.add("Drashti");
		dq.add("Avi");
		dq.add("Priyanshi");
		dq.add("Priya");
		
		System.out.println(dq);
		
		dq.addFirst("Pri");
		System.out.println("After Adding first..........");
		System.out.println(dq);
		
		dq.addLast("Hari");
		System.out.println("Afeter adding last......");
		System.out.println(dq);
	}
}
