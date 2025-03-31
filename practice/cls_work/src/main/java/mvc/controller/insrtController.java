package mvc.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mvc.dao.userDao;
import mvc.model.User;

@WebServlet("cls_work/MVC_crud/insert_data")
public class insrtController extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		
		int id = Integer.parseInt(req.getParameter("id"));
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		
		User user = new User();
		user.setId(id);
		user.setFname(fname);
		user.setLname(lname);
		user.setEmail(email);
		
		userDao dao = new userDao();
		int i = dao.InsertUser(user);
		
		
		if(i>0) {
			req.setAttribute("msg", "Registration success");
			try {
				req.getRequestDispatcher("view_users").forward(req, res);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
