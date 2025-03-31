package com.JDBC;
import java.sql.*;
import java.util.Scanner;

/*
 *  Procedure In MySql
 *  -------------------
 *  delimiter //
 *  create procedure emp_nameBy_id(in id int,out name varchar(50))
 *  begin
 *  select emp_name into name from employe where emp_id = id; 
 *  end //
 *  delimiter ;
 */

public class Callable {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			String query = "call emp_nameBy_id(?,?)";
			System.out.print("Enter Id Of Employee:");
			int id = sc.nextInt();
			
			// load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","12345678");
			
			// create statement
			CallableStatement cs = con.prepareCall(query);
			
			// Passing In parameter 
			cs.setInt(1, id);
			
			// Retrieving Out Parameter
			cs.registerOutParameter(2, Types.VARCHAR);
			
			// executing query
			cs.executeQuery();
				System.out.println("Employee Name :"+cs.getString(2));
				
			//close the connection
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
