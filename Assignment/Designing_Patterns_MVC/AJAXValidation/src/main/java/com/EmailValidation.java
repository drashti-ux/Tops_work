package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/emailValidate")
public class EmailValidation extends  HttpServlet{
	public String checkEmail(String email) {
		String isEmailExist = "false";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/module8","root","12345678");
				PreparedStatement ps = conn.prepareStatement("select * from user where email=?");
				ps.setString(1, email);
				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
					isEmailExist = "true";
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return isEmailExist;		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		PrintWriter out = resp.getWriter();
		out.append(checkEmail(email));
	}
}
