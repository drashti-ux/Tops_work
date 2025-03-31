package com.my_proj;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/first")
public class firstServ extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		System.out.println("servlet Calling..");
	}
}
