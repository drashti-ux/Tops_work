//Write a program to demonstrate the use of different data types.
package Datatypes_Variables_Operators;

public class Lab_Q1 {
	byte num = 5;
	short num1 = 127;
	int num2 =547548652;
	protected long Mobile_no = 35944842346l;
	float num4 = 10.9f;
	private double Salay = 2584645214.025;
	char ch = 'a';
	String Name = "Drashti";
	public String city ="valsad";
	
	public static void main(String []args) {
		Lab_Q1 q1 = new Lab_Q1();
		System.out.println("Byte Number:"+q1.num);
		System.out.println("Short Number : "+q1.num1);
		System.out.println("Integer Number : "+q1.num2);
		System.out.println("Long Number : "+q1.Mobile_no);
		System.out.println("float Number : "+q1.num4);
		System.out.println("Double Number : "+q1.Salay);
		System.out.println("Character : "+q1.ch);
		System.out.println("String Variable: "+q1.Name);
		
	}
}
