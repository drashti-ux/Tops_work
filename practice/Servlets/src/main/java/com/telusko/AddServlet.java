package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addition")
public class AddServlet extends HttpServlet{
	// we can use doGet And doPost method Also 
//	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
//	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int add = a+b;
		PrintWriter out = res.getWriter();
		out.println("Addition ="+add);
	}
}
