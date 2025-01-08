package collections;

import java.util.Deque;
import java.util.LinkedList;

class Palindrom{
	public boolean isPalindrom(String str) {
		Deque<Character> d2 = new LinkedList<Character>();
		
		for(Character c : str.toCharArray()) {
			d2.add(c);
		}
		while(d2.size()>1) {
			if(!d2.pollFirst().equals(d2.pollLast())) {
				return false;
			}
		}
		
		return true;
	}
}
public class Palindromdemo {
	public static void main(String[] args) {
		Palindrom p1 = new Palindrom();
		String s = "siyis";
		System.out.println(s+" is Palindrom? :"+p1.isPalindrom(s));
		
		
	}
}
