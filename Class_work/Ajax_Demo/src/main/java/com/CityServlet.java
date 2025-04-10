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

@WebServlet("/cities")
public class CityServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int sid = Integer.parseInt(req.getParameter("sid"));
		PrintWriter out = resp.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","12345678");
			PreparedStatement ps = con.prepareStatement("select * from city where state_id =?");
			ps.setInt(1, sid);
			ResultSet rs =ps.executeQuery();
			out.append("<option>--Select City--</option>");
			while(rs.next()) {
				out.append("<option value="+rs.getInt(1)+">"+rs.getString(2)+"</option>");
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
