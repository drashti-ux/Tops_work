package com.telusko;

import java.io.IOException;

import com.my_proj.requestDispatcher;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class reqDispatch extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int k = num1+num2;
		
		// passing the value of k into req object
		req.setAttribute("k", k);  // to share the value of k in one servlet to another servlet
		RequestDispatcher rd = req.getRequestDispatcher("sqrt");
		rd.forward(req, res);
	}
}
