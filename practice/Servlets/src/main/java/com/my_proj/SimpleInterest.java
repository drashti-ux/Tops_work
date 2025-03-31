package com.my_proj;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SimpleInterest extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		double pa = Double.parseDouble(req.getParameter("p"));
		double ri =Double.parseDouble(req.getParameter("r"));
		int y = Integer.parseInt(req.getParameter("t"));
		double si = (pa*ri*y)/100;
		PrintWriter out = res.getWriter();
		out.println("simple interest ="+si);
	}
}
