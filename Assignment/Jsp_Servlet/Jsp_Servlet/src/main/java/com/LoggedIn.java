package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/loggedIn")
public class LoggedIn extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = (String)req.getAttribute("name");
		String pass = (String)req.getAttribute("pass");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<center><h1>You Are Logged In Succesfully</h1></center>");
		out.println("<p><b>Name: </b>"+name+"</p>");
		out.println("<p><b>Pass: </b>"+pass+"</p>");
	}
}
