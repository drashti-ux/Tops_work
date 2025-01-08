package collections;

import java.util.PriorityQueue;

public class PriorityQueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
		pq.add(100);
		pq.add(66);
		pq.add(9);
		pq.add(77);
		pq.add(6);
		
		System.out.println(pq);
		
		System.out.println("1:"+pq.peek());
		System.out.println("1:"+pq.poll());
		System.out.println(pq);
		
		System.out.println("2:"+pq.peek());
		System.out.println("2:"+pq.poll());
		System.out.println(pq);
		
		System.out.println("3:"+pq.peek());
		System.out.println("3:"+pq.poll());
		System.out.println(pq);
		
		System.out.println("4:"+pq.peek());
		System.out.println("4:"+pq.poll());
		System.out.println(pq);
		
 	}
}
