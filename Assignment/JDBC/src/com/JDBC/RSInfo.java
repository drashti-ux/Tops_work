//Write a program that retrieves and displays column names, types, and count of a ResultSet using ResultSetMetaData
package com.JDBC;
import java.sql.*;
public class RSInfo {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","12345678");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from std");
		ResultSetMetaData rsm = rs.getMetaData();
		System.out.println("Database Name : "+rsm.getCatalogName(1));
		int columns = rsm.getColumnCount();
		System.out.println("Column Count :"+rsm.getColumnCount());
		for(int i =1;i<=columns;i++) {
			System.out.println("\nColumn Name: "+rsm.getColumnName(i));
			System.out.println("Column Type :"+rsm.getColumnTypeName(i));
			System.out.println("Column type Size : "+rsm.getColumnType(i));
		}
	}
}
