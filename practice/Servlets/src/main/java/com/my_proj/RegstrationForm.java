package com.my_proj;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegstrationForm extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String uname = req.getParameter("Name");
		String fname = req.getParameter("fname");
		long num = Long.parseLong(req.getParameter("mo_no"));
		String gender = req.getParameter("Gender");
		
		PrintWriter out = res.getWriter();
		out.println("Name :"+uname);
		out.println("Father Name :"+fname);
		out.println("Mobile Number: "+num);
		out.println("Gender :"+gender);
	}
}
