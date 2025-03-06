package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Employee;

public class Emp_Dao {
	
	Connection con = null;
	
	public Emp_Dao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assesment","root","12345678");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	for insert employee in the database
	public int add_employee(Employee e) {
		int i = 0;
			try {
				PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?,?)");
				ps.setInt(1, 0);
				ps.setString(2, e.getFname());
				ps.setString(3, e.getLname());
				ps.setString(4, e.getEmail());
				ps.setString(5, e.getMobile());
				ps.setString(6, e.getAddress());
				ps.setString(7, e.getGender());
				ps.setString(8, e.getPass());
				ps.setString(9, e.getCpass());
				
				i = ps.executeUpdate();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		return i;
	}
	
//	for view Employess from the database
	public List<Employee> allEmp() {
		List<Employee> emps = new ArrayList<Employee>();
			try {
				PreparedStatement ps = con.prepareStatement("Select * from employee");
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					Employee emp = new Employee();
					emp.setEmp_id(rs.getInt(1));
					emp.setFname(rs.getString(2));
					emp.setLname(rs.getString(3));
					emp.setEmail(rs.getString(4));
					emp.setMobile(rs.getString(5));
					emp.setAddress(rs.getString(6));
					emp.setGender(rs.getString(7));
					emp.setPass(rs.getString(8));
					emp.setCpass(rs.getString(9));
					
					emps.add(emp);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return emps;
	}
	
//	get Employee By Id
	
	public Employee empById(int id) {
		Employee e = new Employee() ;
		try {
			PreparedStatement ps = con.prepareStatement("Select * from employee where eid =?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				e.setEmp_id(rs.getInt(1));
				e.setFname(rs.getString(2));
				e.setLname(rs.getString(3));
				e.setEmail(rs.getString(4));
				e.setMobile(rs.getString(5));
				e.setAddress(rs.getString(6));
				e.setGender(rs.getString(7));
				e.setPass(rs.getString(8));
				e.setCpass(rs.getString(9));
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return e;
	}

//	for updating employee
	public int updateEmployee(Employee e) {
		int i = 0;
		try {
			PreparedStatement ps = con.prepareStatement("update employee set fname=?,lname=?,email=?,mobile=? where eid=?");
			ps.setString(1, e.getFname());
			ps.setString(2, e.getLname());
			ps.setString(3, e.getEmail());
			ps.setString(4, e.getMobile());
			ps.setInt(5, e.getEmp_id());
			
			i = ps.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return i;
	}

//	for delete Employee
	public int deleteEmployee(int id) {
		// TODO Auto-generated method stub
		int i =0;
		try {
			PreparedStatement ps = con.prepareStatement("delete from employee where eid =?");
			ps.setInt(1, id);
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
}
