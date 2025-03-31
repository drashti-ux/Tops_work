package NumberConversion;

public class BinaryToDec {
	public static void main(String[] args) {
		int num = 100101;
		int i = 1;
		int sum =0;
		while(num!=0) {
			int rem = num%10;
			sum += rem*i;
			num = num/10;
			i=i*2;
		}
		System.out.println(sum);
	}
}
