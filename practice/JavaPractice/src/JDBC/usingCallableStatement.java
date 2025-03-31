package JDBC;
import java.sql.*;
public class usingCallableStatement {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost : 3306/new","root","12345678");
		CallableStatement callStat = con.prepareCall("{CALL empSal(?)}");
		callStat.setInt(1, 25);
		callStat.execute();
		double salary = callStat.getDouble(1);
		System.out.println("Employee Name:" +salary);
		callStat.close();
		con.close();
	}
}
