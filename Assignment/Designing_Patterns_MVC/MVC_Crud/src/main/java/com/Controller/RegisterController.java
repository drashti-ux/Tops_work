package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.Dao.UserDao;
import com.model.User;

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
		u.setId(Integer.parseInt(req.getParameter("id")));
		u.setName(req.getParameter("name"));
		u.setEmail(req.getParameter("email"));
		u.setPass(req.getParameter("pass"));
		
		UserDao dao = new UserDao();
		int i = dao.addUser(u);
		
		if(i>0) {
			PrintWriter out = resp.getWriter();
			req.setAttribute("reg", "Registered Successfull.\n please login!");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
}
