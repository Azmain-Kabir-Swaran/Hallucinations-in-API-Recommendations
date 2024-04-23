package org.example;


import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws Exception {
        JsonFactory factory = new JsonFactory();

        // Example usage with ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper(factory);
        String json = "{ \"name\":\"John\", \"age\":30, \"city\":\"New York\" }";

        // Convert JSON string from file to Object
        Student student = objectMapper.readValue(json, Student.class);

        System.out.println(student);
    }
}