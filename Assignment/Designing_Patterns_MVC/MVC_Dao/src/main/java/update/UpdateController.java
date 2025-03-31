package update;

import java.io.IOException;
import java.io.PrintWriter;

import com.DAO.UserDao;
import com.Model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class UpdateController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String action = req.getParameter("action");
		
		UserDao dao = new UserDao();
		
		if(action.equals("edit")) {
			User u=dao.getUserById(id);
			req.setAttribute("user", u);
			req.getRequestDispatcher("/Edit.jsp").forward(req, resp);
		}
	}
}
