package mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mvc.model.User;

public class userDao {
	Connection con = null;
	public userDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","12345678");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int InsertUser(User u) {
		int i =0;
		try {
			PreparedStatement ps =con.prepareStatement("Insert into user_info values(?,?,?,?)");
			ps.setInt(1, u.getId());
			ps.setString(2, u.getFname());
			ps.setString(3,u.getLname());
			ps.setString(4, u.getEmail());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	public List<User> viewUsers(){
		List<User> users = new ArrayList<User>();
		try {
			PreparedStatement ps = con.prepareStatement("Select * from user_info");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				User u = new User();
				u.setId(rs.getInt(1));
				u.setFname(rs.getString(2));
				u.setLname(rs.getString(3));
				u.setEmail(rs.getString(4));
				users.add(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}
}
