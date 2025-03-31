package com.my_proj;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("uname");
		String pass = req.getParameter("pass");
		
		HttpSession session = req.getSession();
		session.setAttribute("name", name);
		session.setAttribute("pass", pass);
		
		if(name.equals("drashti")&& pass.equals("12345678")) {
			
//			req.setAttribute("name", name);
//			req.setAttribute("pass", pass);
			RequestDispatcher rd = req.getRequestDispatcher("/profile");
			rd.forward(req, res);
			
//			res.sendRedirect("profile?name="+name);         
			
		}
		else {
			res.sendRedirect("Login.html");
		}
	}
}
