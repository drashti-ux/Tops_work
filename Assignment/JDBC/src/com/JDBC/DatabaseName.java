package com.JDBC;
import java.sql.*;
public class DatabaseName {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","12345678");
		DatabaseMetaData dmd = con.getMetaData();

		System.out.println("Database Name :"+dmd.getDatabaseProductName());
		System.out.println("Database VErsion :" +dmd.getDatabaseProductVersion());
		
		ResultSet rs = dmd.getTables("new", null, "%", new String[] {"table"});
		System.out.println("Tables In The Database:");
		while(rs.next()) {
			System.out.println(rs.getString("table_name"));
		}
		
//		ResultSet rs = st.executeQuery("show tables");
//		System.out.println("Tables In The Database:");
//		while(rs.next()) {
//			System.out.println(rs.getString(1));
//		}
		con.close();
	}
}
