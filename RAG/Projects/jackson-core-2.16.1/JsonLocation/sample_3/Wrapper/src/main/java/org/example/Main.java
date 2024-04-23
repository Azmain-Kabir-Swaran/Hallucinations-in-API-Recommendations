package org.example;


import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) throws Exception {
        String json = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        JsonLocation location = new ObjectMapper().readerFor(MyClass.class).readValue(json).getLocation();
        System.out.println("Location: " + location);
    }
}