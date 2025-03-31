package com.my_proj;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class requestDispatcher extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) {
		int a = Integer.parseInt(req.getParameter("a"));
		int aa = a*a;
		
		req.setAttribute("aa", aa);
		RequestDispatcher rd =req.getRequestDispatcher("sqrt");
		try {
			rd.forward(req, res);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

