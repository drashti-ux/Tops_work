package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/GenericServlet")
public class ServUsingGenric extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			out.println("<center><h1>Welcome To The Generic Servlet </h1></center>");
	}

}
