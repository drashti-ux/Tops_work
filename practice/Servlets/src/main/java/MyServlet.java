import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/showing")
public class MyServlet extends HttpServlet {
    public MyServlet() {
        System.out.println("Servlet Object Created!"); // Executed only ONCE
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Request Processed!"); // Executed on EVERY request
    }
}
