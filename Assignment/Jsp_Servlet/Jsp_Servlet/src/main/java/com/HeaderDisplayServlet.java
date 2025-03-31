package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/headersDisp")
public class HeaderDisplayServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Enumeration<String> headers = request.getHeaderNames();
        while(headers.hasMoreElements()) {
        	String name = headers.nextElement();
        	String Value = request.getHeader(name);
        	out.println("<p><b>"+name+": </b>"+Value+"</p>");
        }
        
    }
}
