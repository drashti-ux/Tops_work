//Implement a simple menu-driven program using a switch-case.

package Control_Flow_Statements;

import java.util.Scanner;

public class Lab_Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num1,num2;
		System.out.print("Enter Number 1:");
		num1 = sc.nextInt();
		System.out.print("Enter Number 2:");
		num2 = sc.nextInt();
		System.out.println("Which Action You Want To Perform With This Numbers?");
		System.out.println("1.Addition \n2.Substraction \n3.Multiplication \n4.Division \n5.Find Reminder");
		System.out.println("Enter Your choice:");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			int Add = num1+num2;
			System.out.println("Addition of "+num1+" and "+num2+" = "+Add);
			break;
		}
		case 2:{
			int Sub = num1-num2;
			System.out.println("Substraction of "+num1+" and "+num2+" = "+Sub);
			break;
		}
		case 3:{
			int Mul = num1*num2;
			System.out.println("Multiplication of "+num1+" and "+num2+" = "+Mul);
			break;
		}
		case 4:{
			if(num2 == 0) {
				System.out.println("Division operations is not possible as the divisor (num2) is 0.");
			}
			else {
				double div = (double)num1/num2;
				System.out.println("Addition of "+num1+" and "+num2+" = "+div);
			}
			break;
		}
		case 5:{
			if(num2 == 0) {
				System.out.println("Reminder operations is not possible as the divisor (num2) is 0.");
			}
			else{
				int rem = num1/num2;
				System.out.println("Reminder of "+num1+" and "+num2+" = "+rem);					
				}
			break;
			}
		default:
			System.out.println("Invalid Choice!..");
		}
	}

}
