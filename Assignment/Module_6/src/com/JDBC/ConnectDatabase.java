//Write a simple Java program to connect to a MySQL database using JDBC

package com.JDBC;
import java.sql.*;
public class ConnectDatabase {
	public static void main(String[] args) throws Exception{
		
		// load the Jdbc Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Establish the connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","12345678");
		
		//Varify the connection
		if(conn != null) {
			System.out.println("Connection With MySql Establised!.");
		}
		else {
			System.out.println("Not Connected With MySql!.");
		}
		
		//close the connection
		conn.close();
	}
}
