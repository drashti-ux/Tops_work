package com.telusko;

import java.io.IOException;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookieDemo extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int n1 = Integer.parseInt(req.getParameter("num1"));
		Cookie c = new Cookie("k", n1+"");
		res.addCookie(c);
		res.sendRedirect("sqrt");
	}
}
