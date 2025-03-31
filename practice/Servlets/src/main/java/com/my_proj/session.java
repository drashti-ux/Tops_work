package com.my_proj;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class session extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int val = Integer.parseInt(req.getParameter("num1"));
		
		HttpSession session = req.getSession();
		session.setAttribute("aa", val);
		res.sendRedirect("sqrt");
	}
}
