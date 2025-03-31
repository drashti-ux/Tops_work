package com.telusko;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SessionDemo extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int num1 =Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int k =num1+num2;
		HttpSession seson = req.getSession();
		seson.setAttribute("k", k);
		res.sendRedirect("sqrt");
	}
}
