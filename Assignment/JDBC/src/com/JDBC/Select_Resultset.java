//Write a program that executes a SELECT query and processes the ResultSet to
//display records from the database.
package com.JDBC;
import java.sql.*;
public class Select_Resultset {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","12345678");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from std");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
		}
		con.close();
	}
}
