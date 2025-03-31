package JDBC;
import java.sql.*;
import java.util.Scanner;

public class libraryClass {
	public void addbook(Connection con) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book name:");
		String b_name = sc.nextLine();
		String query ="select * from library where book_name =?";
		PreparedStatement ps =con.prepareStatement(query);
		ps.setString(1, b_name);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			System.out.println("Book Already Exist!!!");
		}
		else {
			System.out.println("Enter Author Name:");
			String a_name = sc.nextLine();
			System.out.println("Enter Book Price:");
			double price =sc.nextDouble();
			System.out.println("Enter Quentity of the book:");
			int quenty = sc.nextInt();
			System.out.println("Enter Available Copies:");
			int copies = sc.nextInt();
			query = "insert into Library values(0,?,?,?,?,?)";
			try {
				PreparedStatement pst = con.prepareStatement(query);
				pst.setString(1, b_name);
				pst.setString(2, a_name);
				pst.setDouble(3, price);
				pst.setInt(4, quenty);
				pst.setInt(5, copies);
				int row = pst.executeUpdate();
				if(row>0) {
					System.out.println(row+" row's affected!..\nBook Inserted Succesfully!..");	
				}
			}
			catch(Exception e){
				System.out.println("Something Went Wrong");
			}
		}
		
		
			
	}
	
	public void UpdateBook(Connection con) throws SQLException {
		Scanner sc = new Scanner(System.in);
		Scanner scc = new Scanner(System.in);
		System.out.println("Enter Book name :");
		String name = scc.nextLine();
		System.out.println("Enter Updated Book name:");
		String b_name = scc.nextLine();
		System.out.println(b_name);
		System.out.println("Enter Updated Author Name:");
		String a_name = scc.nextLine();
		System.out.println("Enter Updated Book Price:");
		double price =sc.nextDouble();
		System.out.println("Enter updated Quentity of the book:");
		int quenty = sc.nextInt();
		System.out.println("Enter Update Available Copies:");
		int copies = sc.nextInt();
		String query = "update Library set book_name =?,author_name=?,price=?,quentity=?,copies = ? where book_name =?";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, b_name);
		pst.setString(2, a_name);
		pst.setDouble(3, price);
		pst.setInt(4, quenty);
		pst.setInt(5, copies);
		pst.setString(6, name);
		int row = pst.executeUpdate();
		System.out.println(row+" row's affected!..\nBook Updated Succesfully!..");		
	}
	
	public void removeBook(Connection con) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book name:");
		String b_name = sc.nextLine();
		String query = "delete from Library where book_name =?";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, b_name);
		int row = pst.executeUpdate();
		if(row>0) {
			System.out.println(row+" row's affected!..\nBook Removed Succesfully!..");		
		}
		else {
			System.out.println("Book Not Exist!!");
		}
		
	}
	public void issueBook(Connection con){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book name:");
		String b_name = sc.nextLine();
		String query = "select * from Library where book_name=?";
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(query);
			pst.setString(1, b_name);
			ResultSet rst = pst.executeQuery();
			rst.next();
			if(rst.getInt(6)>0) {
				System.out.println("Book Available....");
				query = "update Library set copies ="+(rst.getInt(6)-1)+" where book_name ='"+b_name+"'";
				Statement st = con.createStatement();
				int row = st.executeUpdate(query);
				System.out.println("Book Status Updated!!!");
			}
			else{
				System.out.println("Bokk currently not Available!!!");
			}
		} catch (SQLException e) {
			System.out.println("Book Not Found");
		}
		
	}
	
	private void viewBook(Connection con) throws SQLException {
		String query = "select * from library";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getDouble(4)+" : "+rs.getInt(5)+" : "+rs.getInt(6));
		}
		
	}	
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","12345678");
		
//		Statement st = con.createStatement();
//		String query = "create table Library(b_id int primary key auto_increment,book_name varchar(20) unique,author_name varchar(20),price double,quentity int)";
//		st.executeUpdate(query);
//		System.out.println("Table Created Successfully!.");
		
		libraryClass lc = new libraryClass();
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("************Welcome To The Library**************");
		do {
			System.out.println("\n1 : Add Books");
			System.out.println("2 : Show Books");
			System.out.println("3 : Remove Books");
			System.out.println("4 : Issue Books");
			System.out.println("0 : Exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				lc.addbook(con);
				break;
			case 2:
				lc.viewBook(con);
				break;
			case 3:
				lc.removeBook(con);
				break;
			case 4:
				lc.issueBook(con);
				break;
			case 0:
				System.out.println("You Are Exit!!");
				break;
			default:
				System.out.println("Invalid Choice!!");
			}
		}while(choice!=0);
			
		con.close();
	}

	
}
