package Methods_in_Java;

import java.util.Scanner;

class maximum{
	int num1,num2,num3;
	Scanner sc = new Scanner(System.in);
	void max() {
		System.out.println("Enter three numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		if(num1>num2) {
			if(num1>num3) {
				System.out.println("Out of "+num1+" ,"+num2+" ,"+num3+" number "+num1+" is maximum.");
			}
			else {
				System.out.println("Out of "+num1+" ,"+num2+" ,"+num3+" number "+num3+" is maximum.");
			}
		}
		else {
			if(num2>num3) {
				System.out.println("Out of "+num1+" ,"+num2+" ,"+num3+" number "+num2+" is maximum.");
			}
			else {
				System.out.println("Out of "+num1+" ,"+num2+" ,"+num3+" number "+num3+" is maximum.");
			}
		}
	}
}
public class Lab_Q1 {
	public static void main(String [] args) {
		maximum m = new maximum();
		m.max();
	}
}
