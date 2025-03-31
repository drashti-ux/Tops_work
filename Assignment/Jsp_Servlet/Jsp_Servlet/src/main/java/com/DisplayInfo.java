package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/userInfo")
public class DisplayInfo extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String Email = req.getParameter("email");
		String phone = req.getParameter("phone");
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.println("<center><h1>Welcome To The User Info Page</h1></center>");
		out.println("<p><b>Name: </b>"+name+"</p>");
		out.println("<p><b>Email: </b>"+Email+"</p>");
		out.println("<p><b>Phone: </b>"+phone+"</p>");
	}
}
