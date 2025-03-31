package JDBC;
import java.sql.*;

public class metadata_resultsetmetadata {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","12345678");
		DatabaseMetaData dmd = con.getMetaData();
		System.out.println("driver name: "+dmd.getDriverName());
		System.out.println("driver version: "+dmd.getDriverVersion());
		System.out.println("database name: "+dmd.getDatabaseProductName());
		System.out.println("database version "+dmd.getDatabaseProductVersion());
		System.out.println("database connection url: "+dmd.getURL());
		
		Statement st = con.createStatement();
		ResultSet rst = st.executeQuery("select * from std");
		ResultSetMetaData rsmt = rst.getMetaData();
		
		System.out.println(rsmt.getColumnCount());
		System.out.println(rsmt.getColumnName(2));
		System.out.println(rsmt.getColumnTypeName(1));
		System.out.println(rsmt.getColumnLabel(1));
		System.out.println(rsmt.getTableName(1));
		System.out.println(rsmt.getSchemaName(0));
		
		
		con.close();
	}
}
