
package JDBC;
import java.sql.*;    //step 1: import package
public class JDBCconection {
	public static void main(String[] args) throws Exception{
		 // step 2: load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step 3: get connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/drashti", "root", "12345678");
		//step 4:create statement
		Statement st = con.createStatement();
		
//		for printing single row value
//		ResultSet rs = st.executeQuery("select s_code from exam where roll_no = 1;");
//		rs.next();
//			String sub = rs.getInt(1) + " : "+rs.getString(2) ;     //-- rs.getInt(column_no)+":"+rs.getString(column_no)
//			System.out.println(sub);
		
		//step 5 & 6 : execute the query and process the result set
//		for print all values of table
		ResultSet rs = st.executeQuery("select * from exam;");
		while(rs.next()) {
			String sub = rs.getInt(1) + " : "+rs.getString(2) ;
			System.out.println(sub);
		}
		
		// step 7:close the connection
		st.close();
		con.close();
		}
}
