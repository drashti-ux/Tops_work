package com.my_proj;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/second")
public class secServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		System.out.println("in Second Servlet");
	}
}
