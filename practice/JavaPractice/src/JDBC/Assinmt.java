package JDBC;
import java.sql.*;
public class Assinmt {
	
		public static void main(String[] args) throws Exception{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","12345678");
			if(conn != null) {
				System.out.println("Connection With MySql Establised!.");
				DatabaseMetaData dmd = conn.getMetaData();
				System.out.println("Driver Name :"+dmd.getDriverName());
				System.out.println("Driver Version: "+dmd.getDriverVersion());
				System.out.println("JDBC URL :"+dmd.getURL());
			}
			else {
				System.out.println("Not Connected With MySql!.");
			}
			conn.close();
		}
	}
