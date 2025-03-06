package Controller;

import java.io.IOException;

import Dao.Emp_Dao;
import Model.Employee;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/edit_employee")
public class editController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		String fname = req.getParameter("fname");
		String Lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");
		
		Employee e = new Employee();
		e.setEmp_id(id);
		e.setFname(fname);
		e.setLname(Lname);
		e.setEmail(email);
		e.setMobile(mobile);
		
		Emp_Dao dao = new Emp_Dao();
		int i = dao.updateEmployee(e);
		
		if(i>0) {
			res.sendRedirect("/Emp_Management/view_emp");
		}
	}
}
