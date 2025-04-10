package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Student;

public class studDao {
	Connection con= null;
	
	public studDao() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/module8","root","12345678");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int addStudent(Student stud) {
		int i =0;
		try {
			PreparedStatement ps =con.prepareStatement("insert into student values(?,?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, stud.getName());
			ps.setString(3, stud.getEmail());
			ps.setString(4, stud.getPassword());
			ps.setString(5, stud.getImage());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public List<Student> viewStuds() {
		// TODO Auto-generated method stub
		List<Student> studs = new ArrayList();
			try {
				PreparedStatement ps = con.prepareStatement("select * from Student");
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					Student st = new Student();
					st.setId(rs.getInt(1));
					st.setName(rs.getString(2));
					st.setEmail(rs.getString(3));
					st.setPassword(rs.getString(4));
					st.setImage(rs.getString(5));
					studs.add(st);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
					
		return studs;
	}
}
