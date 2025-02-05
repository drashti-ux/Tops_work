package Patterns;

import java.util.Scanner;

public class primeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		boolean prime = true;
		for(int i=2;i<num;i++) {
				if(num%i == 0) {
					prime = false;
				}
		}
		if(prime) {
			System.out.println("prime number");
		}
		else {
			System.out.println("Not prime");
		}
	}
}
