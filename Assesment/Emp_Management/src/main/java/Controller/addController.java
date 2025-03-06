package Controller;

import java.io.IOException;

import Dao.Emp_Dao;
import Model.Employee;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add_employee")
public class addController extends HttpServlet {
	 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");
		String address = req.getParameter("address");
		String gender = req.getParameter("gender");
		String pass = req.getParameter("pass");
		String cpass = req.getParameter("cpass");
		
		Employee e = new Employee();
		e.setFname(fname);
		e.setLname(lname);
		e.setEmail(email);
		e.setMobile(mobile);
		e.setAddress(address);
		e.setGender(gender);
		e.setPass(pass);
		e.setCpass(cpass);
		
		
		
		Emp_Dao dao = new Emp_Dao();
		int i = dao.add_employee(e);
		
		if(i>0) {
			req.setAttribute("msg", "Employee Added Successfully!");
			req.getRequestDispatcher("/Add_emp.jsp").forward(req, res);
		}
	}
}
