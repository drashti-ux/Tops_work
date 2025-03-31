package Controller;

import java.io.IOException;

import Dao.userDao;
import Model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String fname = req.getParameter("fname");
		String pass = req.getParameter("pass");
		
		User u = new User();
		u.setFname(fname);
		u.setPass(pass);
		
		userDao dao = new userDao();
		User user = dao.isUser(u);
		
		if(user==null) {
			req.setAttribute("msg", "Invalid Creditionals!!");
			req.getRequestDispatcher("/login.jsp").forward(req, res);
		}else {
			HttpSession session = req.getSession();
			session.setAttribute("fname", user.getFname());
			req.getRequestDispatcher("/viewUsers").forward(req, res);
		}
	}
}
