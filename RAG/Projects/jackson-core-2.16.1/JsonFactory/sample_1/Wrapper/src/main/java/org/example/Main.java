package org.example;


import java.io.IOException;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class Main {
    public static void main(String[] args) {
        // Create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();
        JsonFactory factory = objectMapper.getFactory();

        // Create a simple Json
        String json = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";

        try {
            // Convert JSON string from file to Object
            Person person = objectMapper.readValue(json, Person.class);

            // Convert Object to JSON string and pretty print
            String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);

            // Print the result
            System.out.println(jsonString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}