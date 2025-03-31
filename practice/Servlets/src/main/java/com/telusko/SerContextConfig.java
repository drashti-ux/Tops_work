package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SerContextConfig extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		out.println("Hii ");
		ServletContext ctx = getServletContext();
		String name = ctx.getInitParameter("Name");
		out.println(name);
		
		ServletConfig con = getServletConfig();
		String nme = con.getInitParameter("Name");
		out.print(nme);
		
	}
}
