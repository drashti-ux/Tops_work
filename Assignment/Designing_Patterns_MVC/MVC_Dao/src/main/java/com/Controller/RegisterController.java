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

@WebServlet("/register")
public class RegisterController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 User u = new User();
		 u.setId(0);
		 u.setName(req.getParameter("name"));
		 u.setEmail(req.getParameter("email"));
		 u.setPassword(req.getParameter("pass"));
		 
		 PrintWriter out = resp.getWriter();
		 resp.setContentType("text/html");
		 
		 UserDao dao = new UserDao();
		 int i = dao.addUser(u);
		 if(i>0) {
			 out.write("<br><h4 style='color:green'><center>Registration Successfully!!</center></h4>");
			 req.getRequestDispatcher("/login.jsp").include(req,resp);
		 }else {
			 req.setAttribute("msg", "Registration Failed");
			 req.getRequestDispatcher("/Register.jsp").forward(req, resp);
		 }
	}
}
