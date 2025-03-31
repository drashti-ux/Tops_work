package NumberConversion;

import java.util.Scanner;

public class DecToOct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		int sum =0;
		int i = 1;
		while(num!=0) {
			int rem = num%8;
			sum += rem*i;
			num = num/8;
			i *= 10;
		}
		System.out.println(sum);
	}
}
