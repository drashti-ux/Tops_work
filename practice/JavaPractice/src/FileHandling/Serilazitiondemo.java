package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 1,must implement Serializable interface
 * 2.most secure
 * 3.store data in binary format
 * 4.use objectOutputStream to write into class
 * 5.use objectInputStream to read from the class
 * 6.Serializable interface do not have any abstract method so it is markup interface
 */



class Employee implements Serializable{
	int emp_id;
	String emp_name;
	long salary;
	
	public Employee(int emp_id,String emp_name,long salary) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.salary = salary;
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Emp_id: "+emp_id+"\nEmp_name: "+emp_name+"\nSalary:"+salary ;
		}
}
public class Serilazitiondemo {
	public static void main(String[] args){
		Employee e1 = new Employee(101,"Drashti",50000);
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("src\\FileHandling\\EmployeeData.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(e1);
			oos.flush();
			oos.close();
			
			System.out.println("Data Written Successfully..");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream fis = new FileInputStream("src\\FileHandling\\EmployeeData.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee e2 = (Employee)ois.readObject();
			ois.close();
			System.out.println(e2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
