package org.example;


import org.hibernate.CacheMode;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Assume sessionFactory and session objects are already initialized here
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        try {
            // Define a criteria for all Account objects where the account's balance is less than 500.00
            Criteria criteria = session.createCriteria(Account.class);
            criteria.add(Restrictions.lt("balance", 500.00));
            criteria.setCacheMode(CacheMode.NORMAL);

            // execute the query
            List<Account> accounts = criteria.list();
            for (Account account : accounts) {
                System.out.println(account.getBalance());
            }
            
            tx.commit();
        } finally {
            session.close();
        }
    }
}