package NumberConversion;

public class DecToHex {
	public static void main(String[] args) {
		int num =1000;
		String sum = "";
		int i = 1;
		while(num!=0) {
			int rem = num%16;
			if(rem>9) {
				char c = (char) (rem+55);
				sum = c + sum;
			}
			else {
				sum = rem +sum;
			}
			num = num/16;
		}
		System.out.println(sum);

	}
}
