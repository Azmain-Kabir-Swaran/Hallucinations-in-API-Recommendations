package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        // Create Configuration object
        Configuration con = new Configuration();
        
        // Set up Hibernate
        con.configure(); // configures settings from hibernate.cfg.xml
        
        // Build Session Factory
        SessionFactory sessionFactory = con.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Transaction transaction = session.beginTransaction();
        
        // Do something in the session
        
        transaction.commit();
        
        session.close();
        
        sessionFactory.close();
    }
}