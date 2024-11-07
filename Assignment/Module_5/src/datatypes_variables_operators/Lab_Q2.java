//Create a calculator using arithmetic and relational operators.
package datatypes_variables_operators;

public class Lab_Q2 {

	public static void main(String[] args) {
		int num1 = 45, num2 = 5;
		
		//for addition
		int sum = num1+num2;
		System.out.println("Addition Of "+num1+" and "+num2+" = "+sum);
		
		//for Substraction
		int sub = num1-num2;
		System.out.println("Substraction Of "+num1+" and "+num2+" = "+sub);
		
		//for multiplication
		int mul = num1*num2;
		System.out.println("Multiplication Of "+num1+" and "+num2+" = "+mul);
		 
		//for division and reminder
		double division = 0;
		int reminder = 0;
		if (num2 != 0) {
			division = (double) num1 / num2;
			reminder = num1 % num2;
			System.out.println("Division of " + num1 + " and " + num2 + " = " + division);
			System.out.println("Remainder of " + num1 + " and " + num2 + " = " + reminder);
		} else {
			System.out.println("Division and remainder operations are not possible as the divisor (num2) is 0.");
		}
		
	}

}
