package org.example;


import javax.persistence.*;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        // configure the SessionFactory and create a Session
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        User user = new User();
        user.setName("Test User");

        // save the user
        session.save(user);

        // commit transaction
        transaction.commit();
        session.close();
    }
}