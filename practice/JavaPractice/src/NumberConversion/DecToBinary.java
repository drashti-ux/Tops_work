package NumberConversion;
import java.util.Scanner;

public class DecToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal Number:");
		int num = sc.nextInt();
//		String bin ="";
//		while(num>=1) {
//			int rem = num%2;
//			bin = rem+bin;
//			num = num/2;
//		}
//		System.out.println(bin);
		
		int sum = 0;
		int i = 1;
		while(num!=0) {
			int rem = num%2;
			sum += rem*i;
			num =num/2;
			i *= 10;
		}
	}
}
