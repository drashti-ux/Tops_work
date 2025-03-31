package com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.model.Laptop;
import com.example.model.Student;



public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	static {
		try {
			if(sessionFactory ==null) {
				sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class).buildSessionFactory();		
			}	
			
		} catch (Exception e) {
			throw new RuntimeException("Error in creating session factory"+e.getMessage());
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
		
	}
}
