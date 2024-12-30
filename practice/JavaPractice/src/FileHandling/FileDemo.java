package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
		File f1 = new File("Draft3.txt");
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("is File or not :"+f1.isFile());
		System.out.println("is Directory or not :"+f1.isDirectory());
		System.out.println("Is Exist or not : "+f1.exists());
		System.out.println("File Name: "+f1.getName());
		System.out.println("File Path: "+f1.getPath());
		System.out.println("File Absolute Path : "+f1.getAbsolutePath());
		System.out.println("Can read File: "+f1.canRead());
		System.out.println("Can Write in file: "+f1.canWrite());
		System.out.println("can Execute the file : "+f1.canExecute());
		
	}
}
