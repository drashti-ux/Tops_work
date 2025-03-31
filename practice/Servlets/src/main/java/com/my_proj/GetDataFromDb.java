package com.my_proj;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GetDataFromDb extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","12345678");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from std");
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			
			out.println("<table border= '2px solid black' >");
			out.println("<thead>");
			out.println("<tr><th>Roll no </th>");
			out.println("<th>Name</th>");
			out.println("<th>Email</th></tr>");
			out.println("</thead>");
			out.println("<tbody>");
			while(rs.next()) {
				out.println("<tr><td>"+rs.getInt(1)+"</td>");
				out.println("<td>"+rs.getString(2)+"</td>");
				out.println("<td>"+rs.getString(3)+"</td></tr>");
			}
			out.println("</tbody>");
			out.println("</table>");
			
			out.close();
			con.close();
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}