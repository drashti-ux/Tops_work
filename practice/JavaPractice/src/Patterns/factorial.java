package Patterns;

public class factorial {
	public static void main(String[] args) {
		int num =7;
		int fact =1;
		for(int i = num;i>=1;i--) {
			fact *= i;
		}
		System.out.println("factorial of "+num+" = "+ fact);
	}
	
}
