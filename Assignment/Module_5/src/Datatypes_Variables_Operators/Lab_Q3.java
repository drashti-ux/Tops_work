//Demonstrate type casting (explicit and implicit).
package Datatypes_Variables_Operators;

public class Lab_Q3 {
	public static void main(String[] args) {
		byte byteVar = 56;
		short shortVar = 2546;
		int intVar = 256483;
		long longVar = 254693483l;
		float floatVar = 9346.25f;
		double doubleVar = 24638.365;
		char charVar = 'k';
		
		System.out.println("Without Type Casting.");
		System.out.println("Byte Variable: "+byteVar);
		System.out.println("Short Variable: "+shortVar);
		System.out.println("Int Variable: "+intVar);
		System.out.println("Long Variable: "+longVar);
		System.out.println("Float Variable: "+floatVar);
		System.out.println("Double Variable: "+doubleVar);
		System.out.println("Character Variable: "+charVar);
		
//		implicit Type Casting 
		doubleVar = floatVar; 
		floatVar = longVar;
		longVar = intVar;
		intVar = shortVar;
		shortVar = byteVar;
		
		System.out.println("\nImplicit TypeCasting..");
		System.out.println("Short Variable: "+shortVar);
		System.out.println("Int Variable: "+intVar);
		System.out.println("Long Variable: "+longVar);
		System.out.println("Float Variable: "+floatVar);
		System.out.println("Double Variable: "+doubleVar);
		
//		Explicit Type Casting
		byteVar = (byte)shortVar;
		shortVar = (short)intVar;
		intVar = (int)longVar;
		longVar = (long)floatVar;
		floatVar = (float)doubleVar;
		doubleVar = (double)charVar;
		charVar = (char)intVar;
		System.out.println("\nExplicit TypeCasting..");
		System.out.println("Short Variable: "+shortVar);
		System.out.println("Int Variable: "+intVar);
		System.out.println("Long Variable: "+longVar);
		System.out.println("Float Variable: "+floatVar);
		System.out.println("Byte Variable: "+byteVar);
		System.out.println("Double Variable: "+doubleVar);
		System.out.println("Character Variable: "+charVar);
	}
}
