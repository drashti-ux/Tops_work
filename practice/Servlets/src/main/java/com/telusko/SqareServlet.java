package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqareServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
//		int i =(int) req.getAttribute("k");  // get value of attribute k which is forwared by reqDispatch
//		int  i = Integer.parseInt(req.getParameter("k"));    // not use get parameter for reqDispatcher it gives the exception 500
		
//		int  i = Integer.parseInt(req.getParameter("k"));        //use with sendRedirect
		
//		HttpSession session = req.getSession();
//		session.removeAttribute("k");    // to remove attributr from session
//		int i =(int) session.getAttribute("k");    // use with session
//		PrintWriter out =res.getWriter();
//		out.println("using session square ="+(i*i));
		
		Cookie c[] = req.getCookies();
		for(Cookie ck :c) {
			if(ck.getName().equals("k")) {	
				int i = Integer.parseInt(ck.getValue());    // use get value method 
				PrintWriter out =res.getWriter();
				out.println("using cookie square ="+(i*i));
			}
		}
//		
		
	}
}
