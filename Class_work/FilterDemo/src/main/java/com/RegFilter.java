package com;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;

@WebFilter("/reg")
public class RegFilter extends HttpFilter{

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		String name =req.getParameter("name");
		String lname = req.getParameter("lname");
		String Email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		if(name.equals("") || name.equals(null)) {
			req.setAttribute("UserErr", "Username Required!!");
			req.getRequestDispatcher("Registration.jsp").forward(req, res);
		}
		if(lname.equals("") || lname.equals(null)) {
			req.setAttribute("LnameErr", "LastName Required!!");
			req.getRequestDispatcher("Registration.jsp").forward(req, res);
		}
		if(Email.equals("") || Email.equals(null)) {
			req.setAttribute("EmailErr", "Email Required!!");
			req.getRequestDispatcher("Registration.jsp").forward(req, res);
		}
		else if(!Validator.checkEmail(Email)) {
			req.setAttribute("EmailErr", "Invalid Email Pattern!!");
			req.getRequestDispatcher("Registration.jsp").forward(req, res);
		}
		if(pass.equals("") || pass.equals(null)) {
			req.setAttribute("PassErr", "Password Required!!");
			req.getRequestDispatcher("Registration.jsp").forward(req, res);
		}
		chain.doFilter(req, res);
	}


}
