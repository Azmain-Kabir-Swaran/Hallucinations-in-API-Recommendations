package org.example;


import org.hibernate.Identifier;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(EntityClass.class)
                .buildSessionFactory();

        Identifier<EntityClass> identifier = new Identifier<>(
                new Object(),
                Identifier.getSerializableType(Long.class)
        );

        // Use the identifier...
    }
}