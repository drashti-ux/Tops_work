package com;

import java.io.IOException;
import java.io.PrintWriter;

import com.mysql.cj.Session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loggedIn")
public class LoggedIn extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		String username = (String) session.getAttribute("username");
		if(username==null) {
			Cookie cookies[] = req.getCookies();
			if(cookies!=null) {
				for(Cookie ck : cookies) {
					if(ck.getName().equals("username")) {
						username = ck.getValue();
						session.setAttribute("username", username);
					}
				}
			}
		}
		if(username!=null) {
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.println("<center><h1>You Are Logged In Succesfully</h1></center>");
			out.println("<p><b>Name: </b>"+username+"</p>");
			out.println("<button><a href=\"LogoutServlet\">Logout</a></button>");
		} else { 
           req.getRequestDispatcher("login.jsp").forward(req, resp);
        } 
//		String name = (String)req.getAttribute("name");
//		String pass = (String)req.getAttribute("pass");
//		resp.setContentType("text/html");
//		PrintWriter out = resp.getWriter();
//		out.println("<center><h1>You Are Logged In Succesfully</h1></center>");
//		out.println("<p><b>Name: </b>"+name+"</p>");
//		out.println("<p><b>Pass: </b>"+pass+"</p>");
	}
}
