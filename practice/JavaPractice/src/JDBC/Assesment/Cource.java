package JDBC.Assesment;

import java.sql.*;
import java.util.Scanner;

public class Cource {
	// initialize the variables which use 
	int c_id=0,c_duration=0;
	String c_name="",c_detail="",query;
	double c_fees=0;
	
	Connection conn =null;   
	Scanner sc = new Scanner(System.in);
	Scanner scan = new Scanner(System.in);   // scanner for read lines/Strings
	
	// constructor for load the class and create connection
	public Cource(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assesment","root","12345678");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	// addCource method to add Cource in the database
	public void addCource(){
		System.out.println("\n**********Add Cource**********");
		System.out.print("Enter Cource Id: ");
		c_id = sc.nextInt();
		
		query = "select * from cource where id =?";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(query);
			ps.setInt(1, c_id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println("Cource Id Already Exist !!");
			}
			else {
				System.out.print("Enter Cource Name: ");
				c_name = scan.nextLine();
				System.out.print("Enter Cource Fees: ");
				c_fees = sc.nextDouble();
				System.out.print("Enter Cource Duration In Month: ");
				c_duration = sc.nextInt();
				System.out.print("Enter Cource Detail: ");
				c_detail = scan.nextLine();
				
				query = "insert into cource (id,name,fees,duration_in_month,details) values(?,?,?,?,?)";
				
				try {
					
					// prepared statement for executing query 
					ps = conn.prepareStatement(query);
					
					//ps.set methods to set the values of ?
					ps.setInt(1, c_id);
					ps.setString(2, c_name);
					ps.setDouble(3, c_fees);
					ps.setInt(4, c_duration);
					ps.setString(5, c_detail);
					
					// execute update method to apply the changes/execute the query
					int count = ps.executeUpdate();
					
					if(count>0) {
						System.out.println("Cource Added !!");
					}
					else {
						System.out.println("Failed to Add Cource !!");
					}
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("Something Went Wrong !!");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	// method for view cource:
	public void viewCource() {
		System.out.println("\n**********View Cources**********");
		query = "select * from cource";
		
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("\nCource Id: "+rs.getInt("id"));
				System.out.println("Cource Name: "+rs.getString("name"));
				System.out.println("Cource Fees: "+rs.getDouble("fees"));
				System.out.println("Cource Duration: "+rs.getInt("duration_in_month")+" Months");
				System.out.println("Cource Details: "+rs.getString("details"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// method For Search the cource
	public void searchCource() {
		int srch = 0;
		System.out.println("\n**********View Cources**********\n");
		
		System.out.println("1: Search Cource By Name");
		System.out.println("2: Search Cource By Cource Id");
		srch = sc.nextInt();
		ResultSet rs;
		if(srch==1) {
			System.out.println("Enter Cource Name:");
			c_name = scan.nextLine();
			query = "select * from cource where name =?";
			
			try {
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setString(1, c_name);
				rs = ps.executeQuery();
				if(rs.next()) {
					System.out.println("Cource Id: "+rs.getInt(1));
					System.out.println("Cource Name: "+rs.getString(2));
					System.out.println("Cource Fees: "+rs.getDouble(3));
					System.out.println("Cource Duration: "+rs.getInt(4)+" Months");
					System.out.println("Cource Details: "+rs.getString(5));
				}
				else {
					System.out.println("Cource For Name "+c_name+" Does not Exit !!");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Enter Cource Id:");
			c_id = scan.nextInt();
			query = "select * from cource where id =?";
			
			try {
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setInt(1, c_id);
				rs = ps.executeQuery();
				if(rs.next()) {
					System.out.println("Cource Id: "+rs.getInt(1));
					System.out.println("Cource Name: "+rs.getString(2));
					System.out.println("Cource Fees: "+rs.getDouble(3));
					System.out.println("Cource Duration: "+rs.getInt(4)+" Months");
					System.out.println("Cource Details: "+rs.getString(5));
				}
				else {
					System.out.println("Cource For Id "+c_id+" Does not Exit !!");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public void editCource() {
		System.out.println("\n************Edit Cource************\n");
		
		System.out.print("Enter Cource Id: ");
		c_id = sc.nextInt();
		
		query = "select * from cource where id =?";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(query);
			ps.setInt(1, c_id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				System.out.print("Enter Cource Name: ");
				c_name = scan.nextLine();
				System.out.print("Enter Cource Fees: ");
				c_fees = sc.nextDouble();
				System.out.print("Enter Cource Duration In Month: ");
				c_duration = sc.nextInt();
				System.out.print("Enter Cource Detail: ");
				c_detail = scan.nextLine();
				
				query = "update cource set name=?,fees=?,duration_in_month=?,details=? where id =?";
				
				try {
					
					// prepared statement for executing query 
					ps = conn.prepareStatement(query);
					
					//ps.set methods to set the values of ?
					ps.setString(1, c_name);
					ps.setDouble(2, c_fees);
					ps.setInt(3, c_duration);
					ps.setString(4, c_detail);
					ps.setInt(5, c_id);
					
					// execute update method to apply the changes/execute the query
					int count = ps.executeUpdate();
					
					if(count>0) {
						System.out.println("Cource Updated !!");
					}
					else {
						System.out.println("Failed to Update Cource !!");
					}
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("Something Went Wrong !!");
				}
			}
			else {
				System.out.println("Cource Id Invalid!!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void deletCource() {
		int srch = 0;
		System.out.println("\n**********Delete Cources**********\n");
		
		System.out.println("1: Delete Cource By Name");
		System.out.println("2: Delete Cource By Cource Id");
		srch = sc.nextInt();
		ResultSet rs;
		if(srch==1) {
			System.out.println("Enter Cource Name:");
			c_name = scan.nextLine();
			query = "delete from cource where name = ?";
			
			try {
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setString(1, c_name);
				int c = ps.executeUpdate();
				if(c>0) {
					System.out.println("Cource of Name "+c_name+" Deleted !!");
				}
				else {
					System.out.println("Cource Not Found !!");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Enter Cource Id:");
			c_id = scan.nextInt();
			query = "delete from cource where id =?";
			
			try {
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setInt(1, c_id);
				int c = ps.executeUpdate();
				if(c>0) {
					System.out.println("Cource of id "+c_id+" Deleted !!");
				}
				else {
					System.out.println("Cource id Not Found !!");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
