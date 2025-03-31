package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import Dao.userDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/delete_user")
public class DeleteController extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		userDao dao = new userDao();
		int i = dao.DeleteUser(id);
		 
//		try {
//			PrintWriter out = res.getWriter();
//			res.setContentType("text/html");
//			out.print("<Center><span>Deleted!!</span></Center>");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
			if(i>0) {
				req.setAttribute("msg", "Deleted successfully");
				RequestDispatcher rd =req.getRequestDispatcher("viewUsers");
				try {
					rd.forward(req, res);
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
