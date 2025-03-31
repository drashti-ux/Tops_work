package JDBC;
import java.sql.*;
public class StudentDAO {
	public static void main(String[] args) throws Exception {
		Student s = new Student();
		String name = s.getName(1);  //for find student
		System.out.println(name);
		
		Student s2 = new Student();
		s2.roll_no = 2;
		s2.name = "yash";
		
		//for add student
		int num = s.AddStudent(s2);
		System.out.println(num+" row's affected");
		
		//for remove student
		int del = s.removeStudent(2);
		System.out.println(del+" row,s affected..");
	}
}

class Student{
	String name;
	int roll_no;
	Connection conn;
	
	public void Connect()throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school_db", "root", "12345678");
	}	
	
	//for find student name of given roll number
	public String getName(int r_no) throws Exception  {
		String query = "select s_name from student where roll_no="+r_no;
		Connect();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString(r_no);
		st.close();
		conn.close();
		return name;
	}
	
	//for add student in the table
	public int AddStudent(Student s) throws Exception {
		String query = "Insert into student values (?,?)";
		Connect();
		PreparedStatement st = conn.prepareStatement(query);
		st.setInt(1, s.roll_no);
		st.setString(2, s.name);
		int count = st.executeUpdate();
		st.close();
		conn.close();
		return count;
	}
	
	// for remove stdent of given roll_no
		public int removeStudent(int r_no) throws Exception {
			String query = "delete from student where roll_no="+r_no;
			Connect();
			Statement st = conn.createStatement();
			int count = st.executeUpdate(query);
			st.close();
			conn.close();
			return count;
		}
	
}