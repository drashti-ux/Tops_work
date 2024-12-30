package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
import java.util.Scanner;

public class FileHandlingDemo {
	public static void main(String[] args) {
		
//		for creating new File
		/*
		 
		File myFile = new File("drashti.txt");
		try {
			myFile.createNewFile();
			System.out.println("File Created Successfully!..");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Something Went Wrpng!..");
			e.printStackTrace();
		}
		
		*/
		
		
//		for Write in file
		/*
		 try {
			FileWriter fl = new FileWriter("src\\Threads\\drashti.txt");
			fl.write("hey Drashtiii...\n welcome in avi's heart");
			fl.close();  // imp to close file
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Something Went Wrpng!..");
			e.printStackTrace();
		}
		 */
		
		
		
//		for Reading File
		
		File myFile = new File("src\\Threads\\drashti.txt");
		try {
			Scanner sc = new Scanner(myFile);
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
//		for deleting file
		
		/*
		 
		File myfile = new File("src\\Threads\\drashti.txt");
		if(myfile.delete()) {
			System.out.println("File Deleted Successfully");
		}
		
		*/
		
	}
}
