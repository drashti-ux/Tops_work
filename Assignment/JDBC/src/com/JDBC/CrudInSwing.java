package com.JDBC;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import net.proteanit.sql.*;
public class CrudInSwing {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	int count;
	String query;
	
	private JFrame frame;
	private JTextField u_id;
	private JTextField u_name;
	private JTextField l_name;
	private JTextField u_email;
	private JTable t;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrudInSwing window = new CrudInSwing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CrudInSwing() {
		initialize();
		Connect();
	}
	
	public void Connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","12345678");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1057, 778);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel heading = new JLabel("Crud In Swing");
		heading.setFont(new Font("Tahoma", Font.BOLD, 18));
		heading.setHorizontalAlignment(SwingConstants.CENTER);
		heading.setBounds(410, 40, 159, 35);
		frame.getContentPane().add(heading);
		
		JLabel id = new JLabel("Enter Id :");
		id.setFont(new Font("Tahoma", Font.PLAIN, 14));
		id.setBackground(new Color(240, 240, 240));
		id.setHorizontalAlignment(SwingConstants.RIGHT);
		id.setBounds(88, 131, 98, 26);
		frame.getContentPane().add(id);
		
		u_id = new JTextField();
		u_id.setBounds(214, 131, 189, 26);
		frame.getContentPane().add(u_id);
		u_id.setColumns(10);
		
		JLabel fname = new JLabel("Enter F_Name :");
		fname.setHorizontalAlignment(SwingConstants.RIGHT);
		fname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		fname.setBackground(UIManager.getColor("Button.background"));
		fname.setBounds(88, 183, 98, 26);
		frame.getContentPane().add(fname);
		
		u_name = new JTextField();
		u_name.setColumns(10);
		u_name.setBounds(214, 183, 189, 26);
		frame.getContentPane().add(u_name);
		
		JLabel lname = new JLabel("Enter L_Name :");
		lname.setHorizontalAlignment(SwingConstants.RIGHT);
		lname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lname.setBackground(UIManager.getColor("Button.background"));
		lname.setBounds(88, 239, 98, 26);
		frame.getContentPane().add(lname);
		
		l_name = new JTextField();
		l_name.setColumns(10);
		l_name.setBounds(214, 242, 189, 26);
		frame.getContentPane().add(l_name);
		
		JLabel email = new JLabel("Enter Email:");
		email.setHorizontalAlignment(SwingConstants.RIGHT);
		email.setFont(new Font("Tahoma", Font.PLAIN, 14));
		email.setBackground(UIManager.getColor("Button.background"));
		email.setBounds(88, 293, 98, 26);
		frame.getContentPane().add(email);
		
		u_email = new JTextField();
		u_email.setColumns(10);
		u_email.setBounds(214, 296, 189, 26);
		frame.getContentPane().add(u_email);
		
		JButton insert = new JButton("Insert");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int id = Integer.parseInt(u_id.getText());
					String fname = u_name.getText();
					String lname = l_name.getText();
					String email = u_email.getText();
					query = "insert into User_info (id,fname,lname,email) values(?,?,?,?)";
					ps = con.prepareStatement(query);
					ps.setInt(1, id);
					ps.setString(2, fname);
					ps.setString(3, lname);
					ps.setString(4,email);
					count = ps.executeUpdate();
					if(count>0) {
						JOptionPane.showMessageDialog(frame, "Data Inseted!!.");
					}
					else {
						JOptionPane.showMessageDialog(frame,"Something Went Wrong!!");
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		insert.setBackground(new Color(0, 128, 64));
		insert.setForeground(new Color(255, 255, 255));
		insert.setFont(new Font("Tahoma", Font.BOLD, 10));
		insert.setBounds(117, 359, 85, 26);
		frame.getContentPane().add(insert);
		
		JButton update = new JButton("Update");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int id = Integer.parseInt(u_id.getText());
					String fname = u_name.getText();
					String lname = l_name.getText();
					String email = u_email.getText();
					query = "update User_info set fname=?,lname=?,email=? where id =?";
					ps = con.prepareStatement(query);
					ps.setString(1, fname);
					ps.setString(2, lname);
					ps.setString(3, email);
					ps.setInt(4, id);
					count = ps.executeUpdate();
					if(count>0) {
						JOptionPane.showMessageDialog(frame, "Data Updated!!.");
					}else {
						JOptionPane.showMessageDialog(frame, "Something Went Wrong!.");
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		update.setForeground(Color.WHITE);
		update.setFont(new Font("Tahoma", Font.BOLD, 10));
		update.setBackground(new Color(128, 128, 255));
		update.setBounds(273, 359, 85, 26);
		frame.getContentPane().add(update);
		
		JButton delete = new JButton("Delete");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					int id = Integer.parseInt(u_id.getText());
					query = "delete from user_info where id =?";
					ps = con.prepareStatement(query);
					ps.setInt(1, id);
					count = ps.executeUpdate();
					if(count>0) {
						JOptionPane.showMessageDialog(frame, "Data Deleted!!.");
					}
					else {
						JOptionPane.showMessageDialog(frame, "Something Went Wrong!.");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		delete.setForeground(Color.WHITE);
		delete.setFont(new Font("Tahoma", Font.BOLD, 10));
		delete.setBackground(new Color(255, 0, 0));
		delete.setBounds(117, 413, 85, 26);
		frame.getContentPane().add(delete);
		
		JButton view = new JButton("View");
		view.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					query = "select * from user_info";
					ps =con.prepareStatement(query);
					rs = ps.executeQuery();
					t.setModel(DbUtils.resultSetToTableModel(rs));
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		view.setForeground(Color.WHITE);
		view.setFont(new Font("Tahoma", Font.BOLD, 10));
		view.setBackground(new Color(0, 128, 64));
		view.setBounds(273, 416, 85, 26);
		frame.getContentPane().add(view);
		
		t = new JTable();
		t.setBounds(450, 131, 571, 308);
		frame.getContentPane().add(t);
		
		
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(872, 239, 17, 48);
		frame.getContentPane().add(scrollBar);
		
		JButton search = new JButton("Search");
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = u_name.getText();
				query = "select * from user_info where fname =?";
				try {
					ps = con.prepareStatement(query);
					ps.setString(1, name);
					rs = ps.executeQuery();
					t.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
			}
		});
		search.setForeground(Color.WHITE);
		search.setFont(new Font("Tahoma", Font.BOLD, 10));
		search.setBackground(new Color(128, 128, 255));
		search.setBounds(194, 466, 85, 26);
		frame.getContentPane().add(search);
		
	}
}
