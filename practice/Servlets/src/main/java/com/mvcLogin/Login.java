package com.mvcLogin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/mvcLogin/login_user")
public class Login extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		
		String uid = req.getParameter("userId");
		String pass = req.getParameter("pass");
		try {
			Connection con = User.getConnection();
			PreparedStatement ps = con.prepareStatement("Select * from user where userId =? and password=?");
			ps.setString(1, uid);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				User user = new User();
				user.setUser_id(rs.getString(1));
				user.setName(rs.getString(2));
				user.setEmail(rs.getString(3));
				user.setPassword(rs.getString(4));
				HttpSession session = req.getSession();
				session.setAttribute("userId",user.getUser_id());
				session.setAttribute("name", user.getName());
				session.setAttribute("email", user.getEmail());
				
				RequestDispatcher rd = req.getRequestDispatcher("/Profile");
				rd.include(req, res);
			}
			else {
				res.setContentType("text/html");
				out.print("<p style=color:'red'>User Not Registered!.</p>");
				RequestDispatcher rd = req.getRequestDispatcher("/mvcLogin/Register.html");
				rd.include(req, res);
			}
		}catch(Exception e) {
			
		}
	}
}
