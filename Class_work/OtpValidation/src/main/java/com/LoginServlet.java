package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		String email = req.getParameter("email");
		String pass= req.getParameter("pass");
		
		Random r = new Random();
		int otp = r.nextInt(1000,9999);
		ServletContext ctx = getServletContext();
		ctx.setAttribute("otp_or", otp+"");
		EmailSending.send(email, "OTP Verification", "Your One Time Password is :\n"+otp);
		req.getRequestDispatcher("/otp.jsp").forward(req, resp);
	}
}
