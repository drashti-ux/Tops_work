package controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import dao.studDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import model.Student;

@WebServlet("/upimg")
@MultipartConfig
public class AddStudController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		Part img =  req.getPart("photo");
		
		String img_name = Paths.get(img.getSubmittedFileName()).getFileName().toString();
		String filename = name+"_"+System.currentTimeMillis()+"_"+img_name;
		String path = req.getServletContext().getRealPath("")+File.separator+"img";
		System.out.println(path);
		
		File file = new File(path);
		if(!file.exists()) {
			file.mkdir();
		}
		
		img.write(path+File.separator+filename);
		
		Student s = new Student();
		s.setName(name);
		s.setEmail(email);
		s.setPassword(pass);
		s.setImage(filename);
		
		studDao dao = new studDao();
		int i = dao.addStudent(s);
		if(i>0) {
			req.setAttribute("msg", "registration Success");
			req.getRequestDispatcher("/index.jsp").forward(req, resp);
		}
	}
}
