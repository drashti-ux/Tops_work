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
import jakarta.servlet.http.HttpSession;

@WebServlet("/edit")
public class EditController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User u = new User();
		u.setId(Integer.parseInt(req.getParameter("id")));
		u.setName(req.getParameter("name"));
		u.setEmail(req.getParameter("email"));
		u.setPass(req.getParameter("pass"));
		
		UserDao dao = new UserDao();
		int i = dao.editUser(u);
		if(i>0) {
			HttpSession session = req.getSession();
			session.setAttribute("user", u);
			req.getRequestDispatcher("profile.jsp").forward(req, resp);
		}else {
			
			PrintWriter out = resp.getWriter();
			resp.setContentType("text/html");
			out.write("<p>Something went Wrong</p>");
			req.getRequestDispatcher("/profile.jsp").include(req, resp);
		}
	}
}
