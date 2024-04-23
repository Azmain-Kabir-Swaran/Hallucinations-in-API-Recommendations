package org.example;


import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class Main {
    public static void main(String[] args) {
        String json = "{\"Name\":\"John\", \"Age\":30, \"City\":\"New York\"}";
        
        try {
            // Parsing the json string to an object
            Gson gson = new Gson();
            Person person = gson.fromJson(json, Person.class);

            System.out.println("Person Name: " + person.getName());
            System.out.println("Person Age: " + person.getAge());
            System.out.println("Person City: " + person.getCity());

        } catch (JsonSyntaxException e) {
            System.out.println("The provided string is not a valid JSON object");
            e.printStackTrace();
        }
    }
}