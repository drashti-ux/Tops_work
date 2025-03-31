//Create a program that reads from one file and writes the content to another file.
package Java_I_O;

import java.io.FileReader;
import java.io.FileWriter;

public class Lab_Q3 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("src\\File_Handling\\NewFile.txt");
			FileWriter fw = new FileWriter("src\\Java_I_O\\ReadWrite.txt");
			int x;
			while((x=fr.read())!=-1) {
				fw.write(x);
			}
			System.out.println("Data Copied!..");
			fr.close();
			fw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
