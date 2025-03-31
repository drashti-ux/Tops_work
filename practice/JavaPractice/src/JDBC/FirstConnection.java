package JDBC;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;


public class FirstConnection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		String name = sc.next();
		System.out.println("Enter Mobile No:");
		String mo_no = sc.next();
		System.out.println("Enter sal:");
		double salary = sc.nextDouble();
		System.out.println("Enter Age:");
		int age = sc.nextInt();
		
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded!!.");
			
			//established the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","12345678");
			System.out.println("Connection Established");
			
			
			// create statement
			Statement st = con.createStatement();
			
			//execute the query
//			ResultSet rs = st.executeQuery("Select * from employe");
			int count =st.executeUpdate("Insert into employe values(31,'"+name+"','"+mo_no+"',"+salary+","+age+")");
//			int count = st.executeUpdate("update employe set emp_name = 'drashti' where emp_id = 31");
//			int count = st.executeUpdate("delete from employe where emp_id = 31");
			
//			process the result
//			while(rs.next()) {
//				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" " +rs.getDouble(4)+" "+rs.getInt(5));
//			}
			System.out.println(count+"Row's Affected!..");
			st.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
