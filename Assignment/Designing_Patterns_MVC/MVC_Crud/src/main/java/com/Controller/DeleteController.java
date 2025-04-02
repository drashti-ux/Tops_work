package com.Controller;

import java.io.IOException;

import com.Dao.UserDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		
		UserDao dao = new UserDao();
		int i = dao.deleteUser(id);
		if(i>0) {
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
	}
}
