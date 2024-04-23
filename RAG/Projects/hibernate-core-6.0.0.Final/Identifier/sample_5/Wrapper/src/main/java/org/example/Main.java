package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        // Your operations here
        // For instance, let's assume there's an "Employee" class
        Query query = session.createQuery("from Employee");
        List employees = query.list();

        for(Object employee : employees) {
            System.out.println("Employee Details : " + employee);
        }

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}