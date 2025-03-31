package Controller;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import Dao.userDao;
import Model.User;
import java.io.IOException;

@WebServlet("/insert_data")
public class insertController extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		
		int id = Integer.parseInt(req.getParameter("id"));
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String pass =req.getParameter("pass");
		
		User user = new User();
		user.setId(id);
		user.setFname(fname);
		user.setLname(lname);
		user.setEmail(email);
		user.setPass(pass);
		
		userDao dao = new userDao();
		int i = dao.InsertUser(user);
		
		
		if(i>0) {
			req.setAttribute("msg", "Inserted success");
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

