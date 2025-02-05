package Patterns;

public class XPattern {
	public static void main(String[] args) {
		int lines = 7;
		int mid = (lines/2)+1;
		int spacecount = 1;
		
		for(int row = 1;row<=lines;row++) {
			
			int num =row;
			for(int space = 1;space<=spacecount;space++) {
				System.out.print("-");
			}
			for(int col=mid;col>=row;col--) {
				System.out.print(num+ " ");
				num++;
			}
			for(int col=mid;col<=row;col++) {
				System.out.print(num+ " ");
				num--;
			}
			System.out.println();
			if(row<mid) {
				spacecount++;
			}
			else {
				spacecount--;
				num--;
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
//		for(int row =1;row<=lines;row++) {
//			if(row<=mid) {
//				int num =row;
//				for(int space =1;space<=row;space++) {
//					System.out.print("-");
//				}
//				for(int col =4;col>=row;col--) {
//					System.out.print(num+ " ");
//					num++;
//				}
//			}
//			else {
//				int num =mid-1;
//				for(int space =mid-1;space>=1;space--) {
//					System.out.print("-");
//				}
//				for(int col=mid;col<=row;col++) {
//					System.out.print(num+" ");
//					num++;
//				}
//				mid--;
//			}
//			System.out.println();
//		}
	}
}
