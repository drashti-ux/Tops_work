package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;

import Dao.UserDao;
import Model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class updateController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("did"));
		String action = req.getParameter("action");
		
		UserDao dao = new UserDao();
		PrintWriter out = resp.getWriter();
		if(action.equals("delete")) {
			int i = dao.deleteUser(id);
			out.append("Deleted Successfully");
		}
		else if(action.equals("update")) {
			User u =dao.userById(id);
			Gson json = new Gson();
			out.append(json.toJson(u));
		}
	}
}
