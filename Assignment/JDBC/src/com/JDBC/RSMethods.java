//Demonstrate how to navigate through the ResultSet using methods like next(),previous(), etc.
package com.JDBC;
import java.sql.*;
public class RSMethods {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","12345678");
		Statement st = con.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE,  ResultSet.CONCUR_READ_ONLY );
		ResultSet rs = st.executeQuery("Select * from std");
		rs.first();
		System.out.println("Printing First Data using first method: \n"+rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
		rs.next();
		System.out.println("\nPrinting Second Data using next method : \n"+rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
		rs.last();
		System.out.println("\nPrinting Last Data using Last method: \n"+rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3) );
		rs.previous();
		System.out.println("\nPrinting Second Last Data using previous method: \n"+rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
		rs.absolute(4);
		System.out.println("\nPrinting Forth row Data using previous method: \n"+rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
		rs.relative(-1);
		System.out.println("\nPrinting Third row Data using previous method: \n"+rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
		con.close();
	}
}
