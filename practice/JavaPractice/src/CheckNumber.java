import java.util.Scanner;

public class CheckNumber {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter Number");
		num = sc.nextInt();
		int cs;
		if(num>=0) {
			cs = 1;
		}
		else{
			cs = -1;
		}
		switch(cs) {
		case 1:{
			if(num == 0) {
				System.out.println("The Number Is Zero");
			}
			else {
				System.out.println("The number Is Positive");
			}
			break;
		}
		case -1:{
			System.out.println("The Number Is Negative");
		}
		}
	}
}
