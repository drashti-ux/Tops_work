package com.Controller;

import java.io.IOException;

import com.Dao.UserDao;
import com.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class loginCotroller extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		UserDao dao = new UserDao();
		User u = new User();
		u = dao.userByEmail(email);
		
		HttpSession session = req.getSession();
		session.setAttribute("user", u);
		
		if(u!=null && u.getEmail().equals(email) && u.getPass().equals(pass)) {
			req.getRequestDispatcher("/profile.jsp").forward(req, resp);
		}else {
			req.setAttribute("msg", "Invalid Creditionals!!");
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
		}
	}
}
