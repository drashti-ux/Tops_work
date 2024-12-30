package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//takes 1byte/character
//	FileOutputStream - to write data in to the file
// FileInputStream - to read data from the File

// takes 2bytes/character
//FileReader - to read data from the file
// FileWriter - to Write data in the file

// must have Exception:
//1.fileNotFount
//2.IOException

public class FileiOStreamdemo {
	public static void main(String[] args) {
		try {
			
//			For creating file and open 
			// it remove the data if the data exist in the file and update with the new data   
//			FileOutputStream fos = new FileOutputStream("src\\FileHandling\\Draft.txt");
			
//			it will not remove the existing data and enter the new data
			FileOutputStream fos = new FileOutputStream("src\\FileHandling\\Draft.txt",true);
			String str = "\nThis File Is Created By Drashti...";
			byte[] b1 =str.getBytes();
			try {
				fos.write(b1);
//				to flush the buffer //remove data from the object it will be saved in the file
				fos.flush();
				System.out.println("Data Writen successfully");
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
//		for read data from the file
		try {
			FileInputStream fin = new FileInputStream("src\\\\FileHandling\\\\Draft.txt");
			int x;
			while((x=fin.read()) != -1) {
				System.out.print((char)x);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
