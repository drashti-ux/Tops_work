package com.my_proj;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;


@WebServlet("/headers")  // Servlet URL Mapping
public class HeaderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>HTTP Headers</title></head><body>");
        out.println("<h2>Request Headers:</h2>");
        out.println("<ul>");

        // Iterate through request headers and display them
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerValue = request.getHeader(headerName);
            out.println("<li><b>" + headerName + ":</b> " + headerValue + "</li>");
        }
        out.println("</ul>");

        // Adding custom response headers
        response.setHeader("Custom-Header", "LearningServlets");
        response.setHeader("Powered-By", "JavaServlet");

        out.println("<h3>Custom Headers added to response:</h3>");
        out.println("<ul>");
        out.println("<li><b>Custom-Header:</b> LearningServlets</li>");
        out.println("<li><b>Powered-By:</b> JavaServlet</li>");
        out.println("</ul>");

        out.println("</body></html>");
    }
}
