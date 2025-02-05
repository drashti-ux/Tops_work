package Patterns;

public class Hpattern {
	public static void main(String[] args) {
		int lines = 5;
		int mid = (lines/2)+1;
		for(int row =1;row<=lines;row++) {
			for(int col =1;col<=lines;col++) {
				if(col==1 ||  col ==5 || row == mid) {
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
