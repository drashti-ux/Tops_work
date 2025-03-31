//Modify the program to use PreparedStatement for parameterized queries
package com.JDBC;
import java.sql.*;
import java.util.Scanner;
public class modifyUsingPreparedStmt {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Roll no:");
		int roll_no = sc.nextInt();
		System.out.println("Enter Student Name:");
		String name = sc.next();
		System.out.println("Enter Student Email:");
		String email = sc.next();
		
		//load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","12345678");
		
		//create statement
		PreparedStatement ps = con.prepareStatement("insert into std values(?,?,?)");
		
		// set the ? values
		ps.setInt(1, roll_no);
		ps.setString(2, name);
		ps.setString(3, email);
		
		//execute query,process the result
		int count = ps.executeUpdate();
		System.out.println(count+" row's Affected!.");
		
		//create statement 2
		Statement st = con.createStatement();
		
		//execute query 2,process the result set
		ResultSet rs =st.executeQuery("select * from std");
		System.out.println("\nStudent Data:");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		
		//close the connection
		con.close();
	}
}
