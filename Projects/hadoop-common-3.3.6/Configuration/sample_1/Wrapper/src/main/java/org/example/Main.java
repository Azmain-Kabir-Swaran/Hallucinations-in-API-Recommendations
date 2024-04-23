package org.example;


import org.apache.hadoop.conf.Configuration;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a new Configuration instance
        Configuration conf = new Configuration();

        // Set a property in the Configuration
        conf.set("foo", "bar");

        // Get a property from the Configuration
        String property = conf.get("foo");
        System.out.println(property);

        // List all properties in the Configuration
        Map<String, String> properties = conf.getAll();
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}