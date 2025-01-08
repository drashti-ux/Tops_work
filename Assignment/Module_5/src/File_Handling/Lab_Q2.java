package File_Handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab_Q2 {
	public static void main(String[] args) {
		try {
			FileReader fr  = new FileReader("src\\File_Handling\\NewFile.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while((line=br.readLine())!= null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
