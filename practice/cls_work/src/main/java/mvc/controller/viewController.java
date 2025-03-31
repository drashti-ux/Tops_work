package mvc.controller;

import java.util.List;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mvc.dao.userDao;
import mvc.model.User;

//@WebServlet("view_users")
public class viewController extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		
		userDao dao = new userDao();
		List<User> users = dao.viewUsers();
		
		req.setAttribute("users", users);
//		req.getRequestDispatcher("MVC_crud/view.jsp");
	}
}
