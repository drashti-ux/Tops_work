//0
//1 0
//0 1 0
//1 0 1 0
//0 1 0 1 0
package Patterns;

//public class Pattern1 {
//	public static void main(String[] args) {
//		for(int row = 1;row <=5;row++) {
//			for(int col =1;col<=row;col++) {
//				if(row%2==0) {
//					if(col%2==0) {
//						System.out.print("0 ");
//					}
//					else {
//						System.out.print("1 ");
//					}
//				}
//				else {
//					if(col%2!=0) {
//						System.out.print("0 ");
//					}
//					else {
//						System.out.print("1 ");
//					}
//				}
//			}
//			System.out.println();
//		}
//	}
//	
//}



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
// Class name should be "Source",
// otherwise solution won't be accepted
public class Source {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		DateTimeFormatter form = DateTimeFormatter.ofPattern("yyyy/mm/dd");
		LocalDate s_date =LocalDate.parse("2019/01/01",form);
		long daysBetween =0;
		try{
			LocalDate e_date = LocalDate.parse(date,form);
			daysBetween = ChronoUnit.DAYS.between(s_date,e_date);
		}
		catch(Exception e){
			System.out.println(e);
		}
		long money = daysBetween*10;
		System.out.println(money);
	}
}