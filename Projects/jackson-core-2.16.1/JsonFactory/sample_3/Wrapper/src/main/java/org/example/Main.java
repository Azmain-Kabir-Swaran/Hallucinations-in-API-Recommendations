package org.example;


import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) throws Exception {
        // Create JsonFactory object
        JsonFactory factory = new JsonFactory();
        
        // Using JsonFactory to create JsonGenerator
        JsonGenerator generator = factory.createGenerator();

        // Create an object to be converted into JSON
        Person person = new Person();
        person.setName("John");
        person.setAge(30);

        // Use Jackson's ObjectMapper to convert the object to JSON
        ObjectMapper mapper = new ObjectMapper();

        // Write JSON to the output
        mapper.writeValue(System.out, person);
    }

    private static class Person {
        private String name;
        private int age;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}