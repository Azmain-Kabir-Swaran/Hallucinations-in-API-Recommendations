package org.example;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = "{ \"name\": \"Bob\", \"age\": \"42\", \"favoriteFood\": \"Potatoes\" }";
            Person p = mapper.readValue(json, Person.class);
            System.out.println("Successfully parsed a person!");
        } catch (JsonMappingException e) {
            System.out.println("Caught JsonMappingException: " + e);
        } catch (JsonProcessingException e) {
            System.out.println("Caught JsonProcessingException: " + e);
        }
    }
}