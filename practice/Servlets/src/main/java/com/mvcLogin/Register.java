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

@WebServlet("/mvcLogin/register_user")
public class Register extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		String uid = req.getParameter("userid");
		String uname = req.getParameter("name");
		String email = req.getParameter("email");
		String pswd = req.getParameter("pass");
		
		try {
			Connection con = User.getConnection();
			PreparedStatement p = con.prepareStatement("select * from user where userId =?");
			p.setString(1, uid);
			ResultSet rs = p.executeQuery();
			if(rs.next()) {
				out.println("<p>Already Registered this UserId</p><p>Please use another userid</p>");
				RequestDispatcher rd = req.getRequestDispatcher("/mvcLogin/Register.html");
				rd.include(req, res);
			}else {
				PreparedStatement ps = con.prepareStatement("Insert into user values(?,?,?,?)");
				ps.setString(1, uid);
				ps.setString(2, uname);
				ps.setString(3, email);
				ps.setString(4, pswd);
				int row = ps.executeUpdate();
				if(row>0) {
					out.print("<h1 color='green'>Registered Succedfully!..</h1>");
					RequestDispatcher rd = req.getRequestDispatcher("/mvcLogin/Loginn.html");
					rd.include(req, res);
				}
				else {
					out.print("<h1>Something went Wrong!.");
				}
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
			out.print("<p>"+e.getMessage()+"</p>");
		}
	}
}
