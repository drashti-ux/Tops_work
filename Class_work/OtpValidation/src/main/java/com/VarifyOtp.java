package com;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/OtpVarification")
public class VarifyOtp extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String otp = req.getParameter("otp");
		ServletContext ctx = getServletContext();
		String or_otp = (String) ctx.getAttribute("otp_or");
		HttpSession session = req.getSession();
		if(or_otp.equals(otp)) {
					session.setAttribute("user", "user");	
					req.getRequestDispatcher("success.jsp").forward(req, resp);
		}else {
			req.getRequestDispatcher("/otp.jsp").forward(req, resp);
		}
	}
}
