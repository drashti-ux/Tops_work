package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import Dao.Emp_Dao;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class deleteController extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		int id = Integer.parseInt(req.getParameter("id"));
		Emp_Dao dao = new Emp_Dao();
		int i = dao.deleteEmployee(id);
		
		if(i>0) {
			try {
				res.sendRedirect("/Emp_Management/view_emp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
