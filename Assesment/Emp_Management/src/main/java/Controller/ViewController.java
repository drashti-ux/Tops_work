package Controller;

import java.io.IOException;
import java.util.List;

import Dao.Emp_Dao;
import Model.Employee;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/view_emp")
public class ViewController extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		Emp_Dao dao = new Emp_Dao();
		List<Employee> emps = dao.allEmp();
		
		try {
			req.setAttribute("emps", emps);
			req.getRequestDispatcher("View.jsp").forward(req, res);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}
}
