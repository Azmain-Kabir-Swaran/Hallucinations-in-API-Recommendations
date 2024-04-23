package org.example;


import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.dialect.Dialect;
import org.hibernate.id.IdentifierGeneratorHelper;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.type.Type;

public class Main {

    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setProperty(Environment.DIALECT, "org.hibernate.dialect.H2Dialect");
        configuration.setProperty(Environment.DRIVER, "org.h2.Driver");
        configuration.setProperty(Environment.URL, "jdbc:h2:mem:test");
        configuration.setProperty(Environment.USER, "sa");
        configuration.setProperty(Environment.PASS, "");
        
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
                .applySettings(configuration.getProperties())
                .buildServiceRegistry();
        
        Dialect dialect = Dialect.getDialect(serviceRegistry);
        Type type = dialect.getTypeRegistration(Long.class, null, serviceRegistry);
        
        IdentifierGeneratorHelper identifierGeneratorHelper = new IdentifierGeneratorHelper();
        Object id = identifierGeneratorHelper.getIdentifier(dialect, type, serviceRegistry, null);
        
        System.out.println("Generated ID is: " + id);
    }
}