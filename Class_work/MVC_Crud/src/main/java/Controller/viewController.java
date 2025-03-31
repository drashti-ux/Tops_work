package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import Dao.userDao;
import Model.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/viewUsers")
public class viewController extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		
		userDao dao = new userDao();
			List<User> users = dao.viewUsers();
		
			try {
				req.setAttribute("users", users);
				RequestDispatcher rd = req.getRequestDispatcher("view.jsp");
				rd.forward(req, res);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
				
		
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		userDao dao = new userDao();
				
		List<User> users = dao.viewUsers();
		
		try {
			req.setAttribute("users", users);
			RequestDispatcher rd = req.getRequestDispatcher("view.jsp");
			rd.forward(req, res);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
