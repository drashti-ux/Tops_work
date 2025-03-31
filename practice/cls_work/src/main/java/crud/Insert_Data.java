package crud;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet("/insert")
public class Insert_Data extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		int uid = Integer.parseInt(req.getParameter("uid"));
		String Name = req.getParameter("name");
		String Email = req.getParameter("email");
		String Lname = req.getParameter("lname");
		 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","12345678");
			PreparedStatement pst = con.prepareStatement("Insert into user_info values(?,?,?,?)");
			pst.setInt(1, uid);
			pst.setString(2,Name);
			pst.setString(3, Lname);
			pst.setString(4, Email);
			int row = pst.executeUpdate();
			if(row>0) {
				out.write("<h1>Data Inserted!..</h1>");
			}
			else {
				out.write("<h1>SomeThing Went Wrong!!..</h1>");
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
