package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.User;

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
			PreparedStatement ps =con.prepareStatement("Insert into user_info values(?,?,?,?,?)");
			ps.setInt(1, u.getId());
			ps.setString(2, u.getFname());
			ps.setString(3,u.getLname());
			ps.setString(4, u.getEmail());
			ps.setString(5, u.getPass());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	public int DeleteUser(int id) {
		int i = 0;
		
		try {
			PreparedStatement ps = con.prepareStatement("delete from user_info where id=?");
			ps.setInt(1, id);
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	public User userByName(String name) {
		User u = new User();
		try {
			PreparedStatement ps = con.prepareStatement("select * from user_info where fname=?");
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				u.setId(rs.getInt(1));
				u.setFname(rs.getString(2));
				u.setLname(rs.getString(3));
				u.setEmail(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
	
	public User isUser(User u) {
		User usr = null;
		try {
			PreparedStatement ps = con.prepareStatement("Select * from user_info where fname=? And password=?");
			ps.setString(1, u.getFname());
			ps.setString(2, u.getPass());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				usr = new User();
				usr.setId(rs.getInt(1));
				usr.setFname(rs.getString(2));
				usr.setLname(rs.getString(3));
				usr.setEmail(rs.getString(4));
				usr.setPass(rs.getString(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usr;
	}
	public User userById(int id) {
		User u = new User();
		try {
			PreparedStatement ps = con.prepareStatement("select * from user_info where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				u.setId(rs.getInt(1));
				u.setFname(rs.getString(2));
				u.setLname(rs.getString(3));
				u.setEmail(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
	
	public int EditUser(User u) {
		int i =0;
		try {
			PreparedStatement ps = con.prepareStatement("update user_info set fname=?,lname=?,email=? where id=?");
			ps.setString(1,u.getFname());
			ps.setString(2, u.getLname());
			ps.setString(3, u.getEmail());
			ps.setInt(4, u.getId());
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
