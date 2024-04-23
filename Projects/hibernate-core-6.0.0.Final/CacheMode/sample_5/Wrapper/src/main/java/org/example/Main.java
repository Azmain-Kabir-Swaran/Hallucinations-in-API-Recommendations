package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.CacheMode;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.HibernateException;

public class Main {

    public static void main(String[] args) {

        SessionFactory factory = null;
        Session session = null;

        try {
            //Create the session factory
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            configuration.setProperty("hibernate.cache.region.factory_class", "org.hibernate.cache.ehcache.EhCacheRegionFactory");
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();

            factory = configuration.buildSessionFactory(serviceRegistry);
            factory.getSettings().setCacheMode(CacheMode.NORMAL);

            //Open a session
            session = factory.openSession();

            //Do some work
            session.beginTransaction();
            
            //...

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(session != null)
                session.close();
            if(factory != null)
                factory.close();
        }
    }
}