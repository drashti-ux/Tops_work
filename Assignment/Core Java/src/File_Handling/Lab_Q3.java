
//Create a program that demonstrates object serialization and deserialization.
package File_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	String student_name;
	int roll_no;
	double marks;
	
	public Student(String student_name, int roll_no, double marks) {
		this.student_name = student_name;
		this.roll_no = roll_no;
		this.marks = marks;
	}
	
	
}
public class Lab_Q3 {
	
	public static void main(String[] args) {
		Student stud = new Student("Drashti",2033,68); 
		try {
			 //Serialization
			FileOutputStream fos = new FileOutputStream("src\\File_Handling\\Student_info.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(stud);
			System.out.println("Data Written Succesfully..");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
				// 	deSerialization
			FileInputStream fis = new FileInputStream("src\\File_Handling\\Student_info.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student std = (Student)ois.readObject();
			
				System.out.println("Student Information By Deserializing The Object");
				System.out.println("Student Name: "+std.student_name);
				System.out.println("Student Roll No: "+std.roll_no);
				System.out.println("Student Marks: "+std.marks);
				
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
