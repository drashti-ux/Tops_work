package crud;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/view")
public class ViewAll extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out =res.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","12345678");
			PreparedStatement ps = con.prepareStatement("select * from user_info");
			ResultSet rs = ps.executeQuery();
			out.write("<table border ='2px solid black'><tr><th>Id</th><th>Name</th><th>LastName</th><th>email</th></tr>");
			while(rs.next()) {
				out.write("<tr>");
				out.write("<td>"+rs.getInt(1)+"</td>");
				out.write("<td>"+rs.getString(2)+"</td>");
				out.write("<td>"+rs.getString(3)+"</td>");
				out.write("<td>"+rs.getString(4)+"</td>");	
				out.write("</tr>");
			}
			out.write("</table>");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
