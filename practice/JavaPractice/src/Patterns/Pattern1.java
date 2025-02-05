//0
//1 0
//0 1 0
//1 0 1 0
//0 1 0 1 0
package Patterns;

public class Pattern1 {
	public static void main(String[] args) {
		for(int row = 1;row <=5;row++) {
			for(int col =1;col<=row;col++) {
				if(row%2==0) {
					if(col%2==0) {
						System.out.print("0 ");
					}
					else {
						System.out.print("1 ");
					}
				}
				else {
					if(col%2!=0) {
						System.out.print("0 ");
					}
					else {
						System.out.print("1 ");
					}
				}
			}
			System.out.println();
		}
	}
	
}
