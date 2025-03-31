package Interface_and_abstractClass;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

class PaymentGateway implements Net_Banking,UPI_Payment,Card_Payment,Bank_Transfer{
	int choice;
	Scanner sc = new Scanner(System.in);
	
    
	public PaymentGateway(int Balance,int amount) {
		// TODO Auto-generated constructor stub
		System.out.println("Order Amount: "+amount);
		System.out.println("\nChoose Payment Method");
		System.out.println("1.Upi Payment \n2.Net Banking \n3.Card Payment \n4.Bank Transfer");
		System.out.println("Enter Your Choice:");
		choice = sc.nextInt();
		System.out.println();
		switch(choice) {
		case 1:{
			via_upi();
			confirm_pay(amount,Balance);
			break;
		}
		case 2:{
			via_netBanking();
			confirm_pay(amount,Balance);
			break;
		}
		case 3:{
			pay_via_card();
			confirm_pay(amount,Balance);
			break;
		}
		case 4:{
			via_banktransfer();
			confirm_pay(amount,Balance);
			break;
		}
		default:{
			System.err.println("Invalid Choice!Please Try Again..");
			break;
		}
		}
		
	}
	void confirm_pay(int amount,int Balance) {
		char ch;
		System.out.println("\nAre you Sure?Y/N");
		ch = sc.next().charAt(0);
		int OTP;
		if(ch=='Y' || ch =='y') {
			System.out.println();
			if(choice == 1) {
				int Pin;
				System.out.println("Enter pin:");
				Pin = sc.nextInt();
				if(cacl_digits(Pin)!=4) {
					System.err.println("Invalid Pin");
				}
				else {
					withDraw(amount,Balance);
				}
			}
			else {
				System.out.println("Enter Four digit OTP:");
				OTP = sc.nextInt();
				if(cacl_digits(OTP)!=4) {
					System.err.println("Invalid Pin");
				}
				else {
					withDraw(amount,Balance);
				}
			}
	        
		}
		else {
			System.err.println("Transction Canceled..");
		}
	}
	@Override
	public void via_banktransfer() {
		// TODO Auto-generated method stub
		long ac_number;
		String Name;
		String IFSC_Code;
		System.out.println("Enter Your Account Number:");
		ac_number = sc.nextLong();
		System.out.println("Enter Account Holder Name:");
		sc.next();
		Name = sc.nextLine();
		System.out.println("Enter IFSC Code:");
		IFSC_Code =sc.nextLine();
	}
	
	@Override
	public void pay_via_card() {
		// TODO Auto-generated method stub
		String Card_holder_name;
		int card_number;
		int expiry_month;
		int expiry_year;
		int Cvv;
		System.out.println("Card Holder Name:");
		sc.next();
		Card_holder_name = sc.nextLine();
		System.out.println("Card Number:");
		card_number = sc.nextInt();
		System.out.println("Expiry Month:");
		if(sc.nextInt()>12 && sc.nextInt()<0) {
			System.out.println("Invalid Month");
		}
		else {
			expiry_month = sc.nextInt();
		}
		System.out.println("Expiry year:");
		expiry_year = sc.nextInt();
		System.out.println("Enter CVV:");
		if(cacl_digits(sc.nextInt())!=3) {
			System.out.println("Invalid CVV!");
		}
		else {
			Cvv = sc.nextInt();			
		}
	}
	@Override
	public void via_upi() {
		// TODO Auto-generated method stub
		String UPI_Id;
		
		System.out.println("Enter UPI Id:");
		UPI_Id = sc.next();
		
	}
	@Override
	public void via_netBanking() {
		// TODO Auto-generated method stub
		String userId;
		int password;
		System.out.println("Enter userId/CustomerId:");
		userId = sc.next();
		System.out.println("Enter Password:");
		password = sc.nextInt();
	}
	
	public int cacl_digits(int num) {
		int count = 0;
		while(num !=0) {
			num = num/10;
			count++;
		}
		return count;
	}
	
	void withDraw(int amount,int balance) {
		System.out.println();
        if(balance > amount) {
        	balance -= amount; 
            System.out.println("Payment SuccessFul..");
            System.out.println("Your Available Balance: "+balance);
        }else {
        	System.err.println("Payment Failed..");
        	System.err.println("Do Not Have Sufficient Balance!..");
        }
	}
}
public class Lab_Q3 {
	public static void main(String[] args) {
		
		Random random = new Random();
        int Balance = random.nextInt(10000);
        System.out.println("Your Balance:"+Balance+"\n");
        
        int amount = random.nextInt(1000);
		PaymentGateway obj = new PaymentGateway(Balance,amount);
	}
}
