package Patterns;

public class Pattern25 {
	public static void main(String[] args) {
			int lines =5;
			for(int row = 1;row <= lines;row++) {
				for(int col = 1;col<= row;col++) {
					System.out.print("*");
				}
				System.out.println();
			}
	}
}