package Patterns;

public class Kpattern {
	public static void main(String[] args) {
		for(int row=1;row<=4;row++) {
			for(int col=4;col>=row;col--) {
				if(col==4 || col == row) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int row =2;row<=4;row++) {
			for(int col=1;col<=row;col++) {
				if(col==1 || col == row) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
