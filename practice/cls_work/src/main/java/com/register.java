package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class register extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		int uid = Integer.parseInt(req.getParameter("uid"));
		String Name = req.getParameter("name");
		String Email = req.getParameter("email");
		String Lname = req.getParameter("lname");
		 resp.setContentType("text/html");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","12345678");
			PreparedStatement pst = con.prepareStatement("Insert into user_info values(?,?,?,?)");
			pst.setInt(1, uid);
			pst.setString(2,Name);
			pst.setString(3, Lname);
			pst.setString(4, Email);
			int row = pst.executeUpdate();
			if(row>0) {
				out.write("<h1>Register SuccessFull!..");
				req.setAttribute("msg", "Register Succesfull!..");
//				req.getRequestDispatcher("reg.jsp").include(req, resp);
//				req.getRequestDispatcher("reg.jsp").forward(req,resp);
				
				resp.sendRedirect("reg.jsp");
			}
			else {
				out.write("<h1>SomeThing Went Wrong!!..</h1>");
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
