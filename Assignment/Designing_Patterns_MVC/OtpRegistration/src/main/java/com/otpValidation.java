package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/validateOtp")
public class otpValidation extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int otpp = Integer.parseInt(req.getParameter("otp"));
		ServletContext ctx = req.getServletContext();
		int otp = (int) ctx.getAttribute("otp");
		if(otpp==otp) {
			PrintWriter out = resp.getWriter();
			out.write("success");
		}
	}
}
