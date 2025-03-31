
public class patterns {
	public static void main(String[] args) {
		int lines = 9;
		int mid = lines/2 +1;
		for(int row = 1;row<=lines;row++) {
			if(row<=mid) {
				for(int col =lines;col>=row;col--) {
					System.out.print(" ");
				}
				for(int col=1;col<=row;col++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			else {
				for(int col=1;col<=row;col++) {
					System.out.print(" ");
				}
				for(int col =lines;col>=row;col--) {
					System.out.print("* ");
				}
				System.out.println();
			}
			
		}
		
		
	}
}

