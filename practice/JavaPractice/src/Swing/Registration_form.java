package Swing;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Registration_form {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500,700);
		frame.setVisible(true);
		frame.setLayout(null);
		
		
		JLabel l1 = new JLabel("Registration Form");
		l1.setBounds(150,50,300,50);
		
		JLabel l2 = new JLabel("User name");
		l2.setBounds(50,100,150,30);
		JTextField user = new JTextField();
		user.setBounds(150,100,150,30);
		
		JLabel l3 = new JLabel("Email");
		l3.setBounds(50,150,150,30);
		JTextField email = new JTextField();
		email.setBounds(150,150,150,30);
		
		JLabel l4 = new JLabel("Gender");
		l4.setBounds(50,200,150,30);
		JRadioButton male = new JRadioButton("Male");
//		JCheckBox male = new JCheckBox("Male");
		male.setBounds(150,200,150,30);
		JRadioButton female = new JRadioButton("Female");
//		JCheckBox female = new JCheckBox("Female");
		female.setBounds(200,200,150,30);
		ButtonGroup bg = new ButtonGroup();
		bg.add(male);
		bg.add(female);
		
		frame.add(l1);
		frame.add(l2);
		frame.add(user);
		frame.add(l3);
		frame.add(email);
		frame.add(l4);
		frame.add(male);
		frame.add(female);
	}
}
