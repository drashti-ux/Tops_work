package crud;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class Delete_Data extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		int uid = Integer.parseInt(req.getParameter("uid"));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","12345678");
			PreparedStatement ps = con.prepareStatement("Delete from user_info where id =?");
			ps.setInt(1, uid);
			int count = ps.executeUpdate();
			if(count>0) {
				out.write("<h1>Data Deleted!!..</h1>");
			}
			else {
				out.write("<h1>Something Went Wrong!!..</h1>");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
