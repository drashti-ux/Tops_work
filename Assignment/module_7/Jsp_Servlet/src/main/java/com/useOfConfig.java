package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class useOfConfig extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		ServletContext ctx = req.getServletContext();
		String contact = ctx.getInitParameter("contact");
		
		ServletConfig parm = getServletConfig();
		String name = parm.getInitParameter("name");
		
		out.println("Hello "+name+" !!!\nFrom The Servlet");
		out.println("Contact: "+contact);
	}
}
