//Implement a file copy program using FileInputStream and FileOutputStream.
package Java_I_O;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Lab_Q2 {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("src\\\\Java_I_O\\\\source.jpg");
			FileOutputStream fos = new FileOutputStream("src\\Java_I_O\\destCopy.jpg");
			int x;
			while((x=fis.read())!= -1) {
				fos.write(x);
			}
			System.out.println("Coppied SuccessFully..");
			fis.close();
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
