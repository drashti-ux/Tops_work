package NumberConversion;

public class OctToDec {
	public static void main(String[] args) {
		int num = 33;
		int sum = 0;
		int i = 1;
		while(num!=0) {
			int rem = num%10;
			sum += rem*i;
			num = num/10;
			i *= 8;
		}
		System.out.println(sum);
	}
}
