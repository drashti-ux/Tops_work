package JDBC;
import java.sql.*;
public class Insert_using_preparedStatement {
	public static void main(String[] args) throws Exception{
		String query = "insert into account values (?, ?, ?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/task", "root", "12345678");
		PreparedStatement st = conn.prepareStatement(query);
		st.setInt(1, 501);
		st.setString(2, "avi");
		st.setString(3, "Chharvada");
		int count = st.executeUpdate();
		System.out.println(count+" row's affected..");
		st.close();
		conn.close();
		
	}
}
