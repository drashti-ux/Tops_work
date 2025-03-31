package JDBC;
import java.sql.*;

public class InsertData {
	public static void main(String[] args) throws Exception {
		String query = "insert into account values(106,'drashti','rola')";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/task", "root", "12345678");
		Statement st = conn.createStatement();
		int row = st.executeUpdate(query);
		System.out.println(row + "row's affected..");
		st.close();
		conn.close();
	}
}
