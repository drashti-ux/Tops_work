package com.my_proj;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class sendRedirect extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		int a = Integer.parseInt(req.getParameter("a"));
		try {
			res.sendRedirect("sqrt?a="+a);    // use req.getParameter in another servlet to access the element a;  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
