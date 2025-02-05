package Patterns;

public class Fibonaci {
	public static void main(String[] args) {
		int digits = 6;
		int first =0;
		int second = 1;
		int next;
	
		System.out.print(first + " ");
		if(digits>1) {
			System.out.print(second+" ");
			for(int i=3;i<=digits;i++) {
				next = first + second;
				System.out.print(next+" ");
				first = second;
				second = next;
			}
		}
	}
}
