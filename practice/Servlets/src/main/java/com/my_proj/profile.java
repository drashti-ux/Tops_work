package com.my_proj;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/profile")
public class profile extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
//		String name = req.getParameter("name");
		
//		String name = (String) req.getAttribute("name");
//		String pass = (String) req.getAttribute("pass");
		
		System.out.println();
		
		HttpSession session = req.getSession();
		String name = (String) session.getAttribute("name");
		
		res.setContentType("text/html");
		out.println("<h1 align ='center'>Welcome to the Profile Page</h1><br>"+name);
		out.println("<a href ='home'><span>Home</span></a><br>");
		out.print("<a href='/about-us'><span>About-us</span></a><br>");
	}
}
