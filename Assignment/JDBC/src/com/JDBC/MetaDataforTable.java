//Use a SELECT query to display this metadata for a specific table
package com.JDBC;
import java.sql.*;

public class MetaDataforTable {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","12345678");
		String table_name = "std";
		String Query ="select column_name,column_type,character_maximum_length from information_schema.columns where table_schema = 'new' and 		table_name='"+table_name+"'";
		
		Statement st = con.createStatement();
		ResultSet rst = st.executeQuery(Query);
		 System.out.println("Metadata for table: " + table_name);
		 System.out.println();
		 System.out.printf("%-20s %-15s %-10s\n", "Column Name", "Data Type", "Max Length");
		while(rst.next()) {
			
			System.out.printf("%-20s %-15s %-10s\n",rst.getString("column_name"),rst.getString("column_type"),rst.getString("character_maximum_length"));
		}
	}
}
