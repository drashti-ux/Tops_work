
public class holoTriangle {
	public static void main(String[] args) {
		int lines = 9;

		for(int row=1;row<=lines;row++) {
			for(int col=lines-1;col>=row;col--) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				if(col ==1 || col ==row || row ==lines) {
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
