package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import Dao.UserDao;
import Model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/editUser")
public class editController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User u = new User();
		u.setId(Integer.parseInt(req.getParameter("id")));
		u.setFname(req.getParameter("fname"));
		u.setLname(req.getParameter("lname"));
		u.setEmail(req.getParameter("email"));
		u.setPass(req.getParameter("pass"));
		
		UserDao dao = new UserDao();
		int i = dao.updateUser(u);
		
		PrintWriter out = resp.getWriter();
		if(i>0) {
			out.append("Updated Successfully");
		}
	}
}
