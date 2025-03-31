package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import Dao.userDao;
import Model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/edit_data")
public class EditController extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		
		int id = Integer.parseInt(req.getParameter("id"));
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		
		User user = new User();
		user.setId(id);
		user.setEmail(email);
		user.setFname(fname);
		user.setLname(lname);
		
		
		
		userDao dao = new userDao();
		int i = dao.EditUser(user);
		
		if(i>0) {
			req.setAttribute("msg", "Update success");
			try {
				req.getRequestDispatcher("/index.jsp").forward(req, res);
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
