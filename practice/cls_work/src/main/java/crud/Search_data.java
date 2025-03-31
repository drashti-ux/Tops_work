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

@WebServlet("/search")
public class Search_data extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out =res.getWriter();
		int uid = Integer.parseInt(req.getParameter("uid"));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","12345678");
			PreparedStatement ps = con.prepareStatement("select * from user_info where id =?");
			ps.setInt(1, uid);
			ResultSet rs = ps.executeQuery();
			rs.next();
			if(rs != null) {
				out.write("<table border ='2px solid black'><tr><th>Id</th><th>Name</th><th>LastName</th><th>email</th></tr>");
				out.write("<td>"+rs.getInt(1)+"</td>");
				out.write("<td>"+rs.getString(2)+"</td>");
				out.write("<td>"+rs.getString(3)+"</td>");
				out.write("<td>"+rs.getString(4)+"</td>");
				out.write("</tr></table>");
			}
			else {
				out.write("<h1>Something went Wrong!!..</h1>");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
