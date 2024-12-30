//Implement multiple catch blocks for different types of exceptions.
package Exception_Handling;

public class Lab_Q2 {
	int[] arr = {25,6,7,1,2,36};
	
	public void divs() {
		try {
			for(int i = 0;i<arr.length;i++) {
				for(int j = i+1;j>i;j++) {
					int z = arr[i]/arr[j];
				}
			}
		}
		catch(ArithmeticException e) {
			System.out.println("1.Error :"+e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("2.Error :"+e);
		}
	}
	public static void main(String [] args) {
		Lab_Q2 div = new Lab_Q2();
		div.divs();
	}
}
