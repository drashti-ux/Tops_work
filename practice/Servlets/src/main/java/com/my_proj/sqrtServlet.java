package com.my_proj;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

public class sqrtServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
//		int k = Integer.parseInt(req.getParameter("k"));
//		k =k * k;
//		HttpSession session = req.getSession();
//		int k = (int)session.getAttribute("k");
//		int k = Integer.parseInt(req.getParameter("k"));
		
//		int k = (int)req.getAttribute("k");
		
		
//		int r = (int)req.getAttribute("aa");
		HttpSession session =req.getSession();
		int r = (int)session.getAttribute("aa");
//		int r = Integer.parseInt(req.getParameter("a"));
		r =r*r;
		PrintWriter out = res.getWriter();
		out.println("in sq using session "+r);
	}
}
