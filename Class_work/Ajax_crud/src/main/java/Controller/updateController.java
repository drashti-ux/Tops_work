package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;

import dao.userDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

@WebServlet("/update")
public class updateController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("did"));
		String action = req.getParameter("action");
		userDao dao = new userDao();			
		PrintWriter out = resp.getWriter();
		int i = 0;
		if(action.equals("delete")) {
			i = dao.deleteUser(id);
			if(i>0) {
				out.append("Deleted Successfully!!");
			}
		}
		
		else if(action.equals("update")) {
			User u = dao.getUserById(id);
			Gson json = new Gson();
			out.append(json.toJson(u));
		}
	}
}
