package com;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter("/login")
public class UseOfFilter extends HttpFilter{
	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String name = request.getParameter("name");
		String pass = request.getParameter("password");
		
		if(name.equals("")||name.equals(null)) {
			request.setAttribute("nameErr", "Username Required!!");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		if(pass.equals("")||pass.equals(null)) {
			request.setAttribute("passErr", "password Required!!");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		chain.doFilter(request, response);
	}
}
