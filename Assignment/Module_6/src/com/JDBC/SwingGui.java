package com.JDBC;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class SwingGui {

	private JFrame frame;
	private JTextField idIn;
	private JTextField fnameIn;
	private JTextField LnameIn;
	private JTextField emailIn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingGui window = new SwingGui();
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
	public SwingGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1059, 793);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel heading = new JLabel("Swing GUI");
		heading.setFont(new Font("Tahoma", Font.PLAIN, 18));
		heading.setHorizontalAlignment(SwingConstants.CENTER);
		heading.setBounds(458, 56, 165, 43);
		frame.getContentPane().add(heading);
		
		JLabel id = new JLabel("id :");
		id.setFont(new Font("Tahoma", Font.PLAIN, 14));
		id.setHorizontalAlignment(SwingConstants.RIGHT);
		id.setBounds(260, 159, 85, 27);
		frame.getContentPane().add(id);
		
		idIn = new JTextField();
		idIn.setBounds(373, 161, 203, 27);
		frame.getContentPane().add(idIn);
		idIn.setColumns(10);
		
		JLabel label = new JLabel("New label");
		label.setBounds(478, 168, 45, 13);
		frame.getContentPane().add(label);
		
		JLabel fname = new JLabel("Fname :");
		fname.setHorizontalAlignment(SwingConstants.RIGHT);
		fname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		fname.setBounds(260, 228, 85, 27);
		frame.getContentPane().add(fname);
		
		fnameIn = new JTextField();
		fnameIn.setColumns(10);
		fnameIn.setBounds(373, 230, 203, 27);
		frame.getContentPane().add(fnameIn);
		
		JLabel Lname = new JLabel("Lname:");
		Lname.setHorizontalAlignment(SwingConstants.RIGHT);
		Lname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Lname.setBounds(260, 291, 85, 27);
		frame.getContentPane().add(Lname);
		
		LnameIn = new JTextField();
		LnameIn.setColumns(10);
		LnameIn.setBounds(373, 293, 203, 27);
		frame.getContentPane().add(LnameIn);
		
		JLabel email = new JLabel("Email :");
		email.setHorizontalAlignment(SwingConstants.RIGHT);
		email.setFont(new Font("Tahoma", Font.PLAIN, 14));
		email.setBounds(260, 359, 85, 27);
		frame.getContentPane().add(email);
		
		emailIn = new JTextField();
		emailIn.setColumns(10);
		emailIn.setBounds(373, 361, 203, 27);
		frame.getContentPane().add(emailIn);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int u_id = Integer.parseInt(idIn.getText());
				String fname = fnameIn.getText();
				String lname = LnameIn.getText();
				String email = emailIn.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","12345678");
					PreparedStatement ps = con.prepareStatement("insert into User_info values(?,?,?,?)");
					ps.setInt(1, u_id);
					ps.setString(2, fname);
					ps.setString(3, lname);
					ps.setString(4, email);
					int count = ps.executeUpdate();
					con.close();
					
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		submit.setBackground(new Color(0, 128, 128));
		submit.setForeground(new Color(255, 255, 255));
		submit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		submit.setBounds(418, 426, 105, 27);
		frame.getContentPane().add(submit);
	}
}
