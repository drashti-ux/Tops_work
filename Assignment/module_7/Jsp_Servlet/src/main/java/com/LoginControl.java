package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginControl extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String pass = req.getParameter("password");
		
		if(name.equalsIgnoreCase("drashti") && pass.equalsIgnoreCase("12345678")) {
			req.setAttribute("name", name);
			req.setAttribute("pass", pass);
			req.getRequestDispatcher("/loggedIn").forward(req, resp);
		}else {
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.println("<center><h1>Invalid Creditionals!!!</h1></center>");
			req.getRequestDispatcher("/login.jsp").include(req, resp);
		}
	}
}
