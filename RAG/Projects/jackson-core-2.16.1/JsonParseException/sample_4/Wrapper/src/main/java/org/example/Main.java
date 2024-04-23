package org.example;


import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxmlJsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        JsonFactory factory = new JsonFactory();
        ObjectMapper mapper = new ObjectMapper(factory);

        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";

        try {
            // Parse JSON to Java object
            Person person = mapper.readValue(json, Person.class);
            
            System.out.println(person.getName()); // John
            System.out.println(person.getAge()); // 30
            System.out.println(person.getCity()); // New York
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}