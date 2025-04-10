package controller;

import java.io.IOException;
import java.util.List;

import dao.studDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

@WebServlet("/viewStd")
public class ViewStudController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		studDao dao = new studDao();
		List<Student> studs = dao.viewStuds();
		req.setAttribute("std", studs);
		req.getRequestDispatcher("display.jsp").forward(req, resp);
	}
}
