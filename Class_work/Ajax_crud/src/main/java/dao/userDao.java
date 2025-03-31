package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.User;

public class userDao {
	Connection con =null;
	public userDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","12345678");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int addUser(User u) {
		int i = 0;
			try {
				PreparedStatement ps = con.prepareStatement("insert into user_info values(?,?,?,?,?)");
				ps.setInt(1, u.getId());
				ps.setString(2, u.getFname());
				ps.setString(3, u.getLname());
				ps.setString(4, u.getEmail());
				ps.setString(5, u.getPass());
				i = ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return i;
	}
	
	public List<User> allusers(){
		List<User> users = new ArrayList<>();
		 try {
			PreparedStatement ps = con.prepareStatement("select * from user_info");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				User u = new User();
				u.setId(rs.getInt(1));
				u.setFname(rs.getString(2));
				u.setLname(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setPass(rs.getString(5));
				users.add(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return users;
	}
	
	public User getUserById(int id) {
		User u = new User();
		try {
			PreparedStatement ps = con.prepareStatement("select * from user_info where id = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				u.setId(rs.getInt(1));
				u.setFname(rs.getString(2));
				u.setLname(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setPass(rs.getString(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
	
	public int deleteUser(int id) {
		int i = 0;
		try {
			PreparedStatement ps = con.prepareStatement("delete from user_info where id =?");
			ps.setInt(1, id);
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}
	
	public int updateUser(User u) {
		int i = 0;
		try {
			PreparedStatement ps = con.prepareStatement("update user_info set fname=?,lname=?,email=?,password=? where id =?");
			ps.setInt(5, u.getId());
			ps.setString(1, u.getFname());
			ps.setString(2, u.getLname());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getPass());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public List<User> serchUser(String name) {
		List<User> users = new ArrayList<>();
		try {
			PreparedStatement ps = con.prepareStatement("select * from user_info where fname like ?");
			ps.setString(1, name+"%");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				User u = new User();
				u.setId(rs.getInt(1));
				u.setFname(rs.getString(2));
				u.setLname(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setPass(rs.getString(5));
				users.add(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}
}
