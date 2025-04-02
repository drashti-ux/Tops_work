package com;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class Register extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		
		Cookie cookie = new Cookie("name", name);
		Cookie cokie = new Cookie("email", email);
		resp.addCookie(cookie);
		resp.addCookie(cokie);
		cookie.setMaxAge(20);
		System.out.println("Cookie Setted");
		req.getRequestDispatcher("index.jsp").forward(req, resp);
		
	}
}
