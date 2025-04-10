package com;

import java.io.IOException;
import java.util.Random;

import org.apache.naming.factory.SendMailFactory;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegistrServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		Random r = new Random();
		int otp =r.nextInt(999,10000);
		sendMail.send(email, "Otp Validation", "Your One Time Password is :"+otp);
		ServletContext ctx = req.getServletContext();
		ctx.setAttribute("otp", otp);
		req.getRequestDispatcher("Otp.jsp").forward(req, resp);
		
	}
}
