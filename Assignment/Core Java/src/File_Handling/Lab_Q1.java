//Write a program to read and write content to a file using FileReader and FileWriter.

package File_Handling;
import java.io.FileReader;
import java.io.FileWriter;

public class Lab_Q1 {
	public static void main(String[] args) {
		
//		write data in file
		try {
			FileWriter f_write = new FileWriter("src\\File_Handling\\NewFile.txt");
			String data = "This data is Written using FileWriter";
			f_write.write(data);
			f_write.flush();
			System.out.println("Data Written Successfully..");
			f_write.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}	
//		read data from the file
		try {
			FileReader f_read = new FileReader("src\\File_Handling\\NewFile.txt");
			int x;
			while((x=f_read.read())!= -1) {
				System.out.print((char)x);
			}
			f_read.close();
			System.out.println("\nFile Closed..");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
