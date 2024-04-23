package org.example;


import org.hibernate.cache.CacheMode;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;
import org.hibernate.dialect.H2Dialect;
import javax.persistence.PersistenceException;

public class Main {

    public static void main(String[] args) {
        
        // Create new configuration
        Configuration configuration = new Configuration()
                .setProperty(AvailableSettings.DIALECT, H2Dialect.class.getName())
                .setProperty(AvailableSettings.SHOW_SQL, "true")
                .setProperty(AvailableSettings.HBM2DDL_AUTO, "create")
                .setCacheMode(CacheMode.NORMAL); // Set the CacheMode

        // Create sessionFactory from configuration
        try (SessionFactory sessionFactory = configuration.buildSessionFactory()) {
            System.out.println("SessionFactory has been successfully created.");
        } catch (PersistenceException e) {
            System.out.println("SessionFactory creation has been failed: " + e.getMessage());
        }
    }
}