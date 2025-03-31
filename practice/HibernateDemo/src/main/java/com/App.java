package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.example.model.Laptop;
import com.example.model.Student;
import com.hibernate.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//        System.out.println(sessionFactory);
        
        Laptop l = new Laptop();
        l.setLid(101);
        l.setLname("Dell");
        
        Student s = new Student();
        s.setName("drashti");
        s.setCollage("GECD");
        s.setFathername("Jitendra");
        s.setPhone("1234567890");
        s.setLaptop(l);
        
        
        
       Session session = sessionFactory.openSession();
       
       Transaction transaction = null;
       try {
    	   transaction = session.beginTransaction();
    	   session.persist(s);
    	   session.persist(l);
    	   transaction.commit();
    	   Student s1 = session.get(Student.class,1);
    	   System.out.println("Student Name:"+s1.getName());
//    	   System.out.println("Student Saved Successfully!");
//    	   System.out.println("Laptop Saved Successfully!");
//    	   session.save(s);
		} catch (Exception e) {
			// TODO: handle exception
			if(transaction!=null) {
				transaction.rollback();
			}
		}
       
       finally{
    	   session.close();
       }
       
    }
}
