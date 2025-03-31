package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SerMethods")
public class ServltMethods extends HttpServlet{
	@Override
		public void init() throws ServletException {
			System.out.println("Init Method Called..");
		}
	
	@Override
		protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			// TODO Auto-generated method stub
			System.out.println("Service Method Called..");
			PrintWriter out = res.getWriter();
			out.println("Hello To Service");
		}
	
	@Override
		public void destroy() {
			System.out.println("Destroy Method Called..");
		}
	
}
