//Create a program that inserts, updates, selects, and deletes data using Statement

package com.JDBC;
import java.sql.*;
import java.util.Scanner;

public class insertUpdateDeleteSelect {
	public static void main(String[] args) {
		String query;
		int roll_no,row;
		String name,email;
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","12345678");
			Statement st = con.createStatement();
			
			//for insert
			System.out.println("For Insert");
			System.out.println("Enter roll no:");
			roll_no = sc.nextInt();
			System.out.println("Enter Name:");
			name = sc.next();
			System.out.println("Enter Email:");
			email = sc.next();
			query = "insert into std values("+roll_no+",'"+name+"','"+email+"')";
			row= st.executeUpdate(query);
			System.out.println(row+" row's affected!.");
			System.out.println("Data inserted successfully!.");
			
			//for update
			System.out.println("For Update");
			System.out.println("Enter roll no of student which you want to update:");
			roll_no = sc.nextInt();
			System.out.println("Enter Update name:");
			name = sc.next();
			System.out.println("Enter Update Emial:");
			email = sc.next();
			query = "update std set name ='"+name+"',email ='"+email+"' where roll_no ="+roll_no;
			row = st.executeUpdate(query);
			System.out.println(row+" row's affected!.");
			System.out.println("Data Updated successfully!.");
			
			//for delete
			System.out.println("For Update");
			System.out.println("Enter roll no of student which you want to delete:");
			roll_no = sc.nextInt();
			query = "delete from std where roll_no ="+roll_no;
			row = st.executeUpdate(query);
			System.out.println(row+" row's affected!.");
			System.out.println("Data deleted successfully!.");
			
			// for select perticular data
			System.out.println("Enter ROll No to find the student:");
			roll_no = sc.nextInt();
			query = "select * from std where roll_no ="+roll_no;
			ResultSet rs = st.executeQuery(query);
			rs.next();
			System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
			
			
			// for select all
			query = "select * from std";
			rs = st.executeQuery(query);
			System.out.println("\nDisplaying Updates in table Std\n");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
			
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}
}
