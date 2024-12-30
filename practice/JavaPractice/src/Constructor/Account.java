//Constructor with Validation
//Write a Java program to create a class called Account with instance variables accountNumber and balance. Implement a parameterized constructor that initializes these variables with validation:
//
//accountNumber should be non-null and non-empty.
//balance should be non-negative.
//Print an error message if the validation fails.
package Constructor;

public class Account {
	String accountNumber;
	double balance;
	
	Account(String acNumber,double bal){
		if(acNumber == null || acNumber.isEmpty()) {
			System.err.println("Error: Account number cannot be null or empty.");
		}
		else if(bal < 0) {
			System.err.println("Error: Balance Should not Be negative");
		}
		else {
			accountNumber = acNumber;
			balance = bal;			
		}
	}
	
	public static void main(String [] args) {
		Account ac = new Account("BNo15246",5241.03);
		System.out.println("Account Number: "+ac.accountNumber);
		System.out.println("Balance: "+ac.balance);
		
		ac = new Account("",2543.00);
		
		ac = new Account("hdks025",-6534);
	}
}
