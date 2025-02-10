//Write a program that retrieves and displays metadata information about your database using DatabaseMetaData
package com.JDBC;
import java.sql.*;
public class DatabaseInfo {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","12345678");
		DatabaseMetaData dm =con.getMetaData() ;
		System.out.println("Driver name: "+dm.getDriverName());
		System.out.println("Driver class: "+dm.getClass());
		System.out.println("Driver version: "+dm.getDriverVersion());
		System.out.println("Driver productName: "+dm.getDatabaseProductName());
		System.out.println("driver product version "+dm.getDatabaseProductVersion());
		System.out.println("jdbc version "+dm.getJDBCMajorVersion());
		System.out.println("functions :"+dm.getNumericFunctions());
		System.out.println("key words in sql:"+dm.getSQLKeywords());
		System.out.println("Url: "+dm.getURL());
		System.out.println("username: "+dm.getUserName());
		String driverName = dm.getDriverName();
		System.out.println("Driver name :"+driverName);
	}
}
