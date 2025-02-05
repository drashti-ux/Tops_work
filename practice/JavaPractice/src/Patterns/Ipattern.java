package Patterns;

public class Ipattern {
	public static void main(String[] args) {
		int lines = 5;
		int mid = (lines/2)+1;
		for(int row =1;row<=lines;row++) {
			for(int col =1;col<= lines;col++) {
				if(row == 1|| row ==lines || col == mid) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
