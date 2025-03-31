package JDBC;
import java.sql.*;
import java.util.Scanner;
public class Task {
	public static void main(String[] args) throws Exception {
		int roll_no;
		String name,email;
		Scanner sc = new Scanner(System.in);
		// load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","12345678");
//		Statement st = con.createStatement();
		
		String query = "";
		boolean quit = false;
			if(con != null) {
				System.out.println("Connected To Database");
			}else 
			{
				System.out.println("Failed to connect with Database");
				quit = true;
			}
			
			System.out.println();
			System.out.println("1. Insert The data in the Database table");
			System.out.println("2. Update into the Database table");
			System.out.println("3. Delete from the database table");
			System.out.println("4. Show table");
			System.out.println("5. exit");
			
			while(!quit) {
			System.out.println("\nWhat you want to do with the database");
			System.out.println("Enter Your choice :");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:{
				System.out.println("--------------For Insert Data--------------");
				System.out.print("Enter Roll no:");
				roll_no = sc.nextInt();
				System.out.print("Enter Name: ");
				name = sc.next();
				System.out.print("Enter Email :");
				email = sc.next();
//				query = "insert into std values("+roll_no+",'"+name+"','"+email+"')";
//				int count = st.executeUpdate(query);
				
				query = "insert into std values(?,?,?)";
				PreparedStatement pst = con.prepareStatement(query);
				pst.setInt(1, roll_no);
				pst.setString(2, name);
				pst.setString(3, email);
				int count = pst.executeUpdate();
				
				System.out.println(count+" row's Affected!.");
				System.out.println("Data Inserted SuccessFully!..");
				break;
			}
			case 2:{
				System.out.println("---------------For Update--------------");
				System.out.println("Enter Roll no: ");
				roll_no = sc.nextInt();
				System.out.println("Enter Name :");
				name = sc.next();
				System.out.println("Enter Email:");
				email = sc.next();
				query = "update std set name =?,email =? where roll_no=?";
//				int count = st.executeUpdate(query);
				
				PreparedStatement pst = con.prepareStatement(query);
				pst.setInt(3, roll_no);
				pst.setString(1, name);
				pst.setString(2, email);
				int count = pst.executeUpdate();
				
				System.out.println(count+" row's Affected!.");
				if(count>0) {
					System.out.println("Data Updated SuccessFully!..");
				}else {
					System.err.println("Sorry!..Roll no not found!.\nFailed to Updated Data!..");
				}
				
				break;
			}
			case 3:{
				System.out.println("-----------For Delete------------");
				System.out.println("Enter roll no:");
				roll_no = sc.nextInt();
//				query = "delete from std where roll_no="+roll_no;
//				int count = st.executeUpdate(query);
				
				query = "delete from std where roll_no=?";
				PreparedStatement pst = con.prepareStatement(query);
				pst.setInt(1, roll_no);
				int count = pst.executeUpdate();
				
				System.out.println(count+"row's affected!.");
				System.out.println("Data Deleted SuccessFully!..");
				break;
			}
			case 4:{
				query = "select * from std";
				PreparedStatement pst = con.prepareStatement(query);
				ResultSet rs = pst.executeQuery(query);
				
//				ResultSet rs = st.executeQuery(query);
				System.out.println("Roll no "+"\t"+"student name"+"\t"+"student email \n------------------------------------------------");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
				}
				System.out.println();
				break;
			}
			case 5:
			default:{
				con.close();
				System.out.println("\nConnection Closed!..Thank You!");
				quit = true;
				
			}
			}
			}
			
			
	}
}
