package com.my_proj;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class doGet_doPost extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		try {
			res.setContentType("text/html");
			int a =Integer.parseInt(req.getParameter("a"));
			PrintWriter out = res.getWriter();
			out.println("<h1>In Get Method a ="+a+"</h1>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		res.setContentType("text/html");
		try {
			PrintWriter out = res.getWriter();
			int a =Integer.parseInt(req.getParameter("a"));
			out.println("<h1>In Post Method a ="+a+"<h1>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
