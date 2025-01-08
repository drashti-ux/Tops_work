package Java_I_O;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lab_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type 'END' to end the file");
		try {
			FileWriter fw = new FileWriter("src\\Java_I_O\\UserInput.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			while(true) {
				String input = sc.nextLine();
				
				if("End".equalsIgnoreCase(input)) {
					break;
				}
				bw.write(input);
				bw.newLine();
			}
			bw.close();
			fw.close();
			System.out.println("Data Writeen Succesfully.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally{
			
			sc.close();
		}
		
	}
}

