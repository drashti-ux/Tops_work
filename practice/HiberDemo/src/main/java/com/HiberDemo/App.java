package com.HiberDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        Aelian alian = new Aelian();
        alian.setAid(101);
        alian.setAname("navin");
        alian.setAcolor("green");
        
        Configuration configer = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf = configer.buildSessionFactory();
        Session session = sf.openSession();
        
        Transaction transaction = session.beginTransaction();
        session.persist(alian);
        transaction.commit();
        
        session.close();
        
    }
}
