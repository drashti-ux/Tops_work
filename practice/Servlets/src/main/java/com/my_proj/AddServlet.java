package com.my_proj;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int n1 = Integer.parseInt(req.getParameter("num1"));
		int n2 =Integer.parseInt(req.getParameter("num2"));
		
		int add = n1+n2;
		
//		HttpSession session = req.getSession();
//		session.setAttribute("k", add);
//		
		
//		send one servlet to another sevlet by using redirect method
		res.sendRedirect("sq?k="+add);
		
//		send one servlet to another by using requestDispatcher
//		req.setAttribute("k", add);
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
		
//		PrintWriter out = res.getWriter();
//		out.println("Result is "+add);
	}
}
