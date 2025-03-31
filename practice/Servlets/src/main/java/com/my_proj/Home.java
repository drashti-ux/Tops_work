package com.my_proj;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/home")
public class Home extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
//		String name = (String) req.getAttribute("name");
		
		HttpSession session = req.getSession();
		String name = (String) session.getAttribute("name");
		
		res.setContentType("text/html");
		out.println("<h1 align ='center'>Welcome to the Home Page</h1><br>"+name);
	}
}
