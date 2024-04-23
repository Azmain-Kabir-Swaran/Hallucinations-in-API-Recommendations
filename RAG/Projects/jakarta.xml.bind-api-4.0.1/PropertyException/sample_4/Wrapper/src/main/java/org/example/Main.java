package org.example;


import jakarta.xml.bind.PropertyException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws PropertyException {
        Properties properties = new Properties();

        // Example: setting a property
        properties.setProperty("key", "value");

        // Example: getting a property that does not exist throws PropertyException
        try {
            System.out.println(properties.getProperty("nonexistentKey"));
        } catch (PropertyException e) {
            System.out.println(e.getMessage());
        }
    }
}