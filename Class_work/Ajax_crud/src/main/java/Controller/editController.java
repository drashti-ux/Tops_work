package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import dao.userDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

@WebServlet("/edit")
public class editController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User u = new User();
		u.setId(Integer.parseInt(req.getParameter("id")));
		u.setFname(req.getParameter("fname"));
		u.setLname(req.getParameter("lname"));
		u.setEmail(req.getParameter("email"));
		u.setPass(req.getParameter("pass"));
		
		userDao dao = new userDao();
		int i = dao.updateUser(u);
		
		PrintWriter out = resp.getWriter();
		if(i>0) {
			out.append("Updated Successfully");
		}
	}
}
