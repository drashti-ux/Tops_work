package JDBC.Assesment;

import java.util.Scanner;

public class CourceManagement {
	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------Welcome To The Cource Management System--------------\n");
		
		do {
		System.out.println("1: Add Cource");
		System.out.println("2: View Cource");
		System.out.println("3: Search Cource");
		System.out.println("4: Edit Cource");
		System.out.println("5: Delete Cource \n");
		System.out.print("- Enter Your choice : ");
		choice = sc.nextInt();
		Cource c = new Cource();
		switch(choice) {
		case 1:
			c.addCource();
			break;
		
		case 2:
			c.viewCource();
			break;
		case 3:
			c.searchCource();
			break;
		case 4:
			c.editCource();
			break;
		case 5:
			c.deletCource();
			break;
		default:
			choice = 0;
			System.out.println("Exiting from Cource Management System");
			System.out.println("Thank You!!");
		}
		}while(choice!=0);
	}
}
