package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		try {
			
//			Create file And write In to the File
			FileWriter fw = new FileWriter("src\\FileHandling\\Draft2.txt",true);
			System.out.println("Enter String which You Want To Insert:");
			String str = sc.nextLine();
			fw.write(str);
			fw.flush();
			System.out.println("Data inserted SuccesFully..");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//			Read data from the File
		try {
			FileReader fr = new FileReader("src\\FileHandling\\Draft2.txt");
			int x;
			while((x=fr.read())!=-1){
				System.out.print((char)x);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
