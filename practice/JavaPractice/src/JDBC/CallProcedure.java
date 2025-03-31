package JDBC;
import java.sql.*;
public class CallProcedure {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","12345678");
		CallableStatement cst = con.prepareCall("call allemp");
		ResultSet rs = cst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getDouble(4)+" : "+rs.getInt(5));
		}
		con.close();
	}
}
