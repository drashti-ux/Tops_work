package com.mvcLogin;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Profile")
public class Profile extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		res.setContentType("Text/html");
		HttpSession session = req.getSession();
	
		out.println("<h1><b>UserId:</b>"+session.getAttribute("userId")+"</h1>");
		out.println("<h1><b>UserName:</b>"+session.getAttribute("name")+"</h1>");
		out.println("<h1><b>UserEmail:</b>"+session.getAttribute("email")+"</h1>");
	}
}
