package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.DAO.UserDao;
import com.Model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class loginController extends HttpServlet {
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String email = req.getParameter("email");
			String pass = req.getParameter("pass");
			
			UserDao dao = new UserDao();
			User u =dao.userByEmail(email);
			
			
			PrintWriter out = resp.getWriter();
			 resp.setContentType("text/html");
			 HttpSession session = req.getSession();
			 
			if(email.equals(u.getEmail()) && pass.equals(u.getPassword())) {
				session.setAttribute("user", u);
				req.getRequestDispatcher("/profile.jsp").include(req,resp);
			}else {
				out.write("<br><h4 style='color:red'><center>Invalid Creditionals!!</center></h4>");
				req.getRequestDispatcher("/login.jsp").include(req,resp);
			}
		}
}
