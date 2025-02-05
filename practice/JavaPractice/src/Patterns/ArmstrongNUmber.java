package Patterns;

public class ArmstrongNUmber {
	public int digits(int num) {
		int digit =0;
		while(num>0){
			int reminder = num%10;
			num = num/10;
			 digit++;
		}
		return digit;
	}
	public boolean isArmStrong(int num) {
		int n = num;
		int digit = digits(num);
		int sum =0;
			for(int i=1;i<=digit;i++) {
				int reminder = num%10;
				sum += (int) Math.pow(reminder, digit);
				num = num/10;
			}
			if(n==sum) {
				return true;
			}
			else {
				return false;
			}
	}
	
	public static void main(String[] args) {
		int num =2820;
		ArmstrongNUmber as = new ArmstrongNUmber();
		
			if(as.isArmStrong(num)) {
				System.out.println(num+" is Armstrong Number");
			}
			else {
				System.out.println(num+" is Not Armstrong Number");
			}
	}
}
