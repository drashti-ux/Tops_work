package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.User;

public class UserDao {
	Connection con = null;
	public UserDao() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/module8","root","12345678");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int addUser(User u) {
		int i=0;
			try {
				PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?,?);");
				ps.setInt(1, u.getId());
				ps.setString(2, u.getName());
				ps.setString(3, u.getEmail());
				ps.setString(4, u.getPass());
				i = ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return i;
	}
	public User userByEmail(String email) {
		// TODO Auto-generated method stub
		User u = null;
		try {
			PreparedStatement ps = con.prepareStatement("select * from user where email=?");
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				u = new User();
				u.setId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setEmail(rs.getString(3));
				u.setPass(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
	public int editUser(User u) {
		// TODO Auto-generated method stub
		int i =0;
		try {
			PreparedStatement ps = con.prepareStatement("update user set name=?,email=?,pass=? where id=?");
			ps.setString(1, u.getName());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getPass());
			ps.setInt(4, u.getId());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	public int deleteUser(int id) {
		int i = 0;
		// TODO Auto-generated method stub
				try {
					PreparedStatement ps =con.prepareStatement("delete from user where id=?");
					ps.setInt(1, id);
					i = ps.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
		return i;
	}
	
	
	
	
	
}
