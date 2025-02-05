package Patterns;

public class Pattern2 {
public static void main(String[] args) {
	 for(int row =1;row<=3;row++) {
		 for(int col = 3;col>=row;col--) {
			 System.out.print(" ");
		 }
		 for(int col = 1;col<=2*row-1;col++) {
			 System.out.print("*");
		 }
		 System.out.println(); 
	 }
	 for(int row =0;row<3;row++) {
		 
		 for(int col = 1;col<=row+2;col++) {
			 System.out.print(" ");
		 }
		
		 for(int col = 1;col<=3-row*2;col++) {
			 System.out.print("*");
		 }
		 System.out.println(); 
	 }
	 
	}
}
