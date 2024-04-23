package org.example;


import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Main {
    public static void main(String[] args) {
        // Creating a new person instance
        Person person = new Person("John", 30);

        // Using Gson to convert the Person instance to a JSON string
        Gson gson = new Gson();
        String json = gson.toJson(person);

        System.out.println(json);
    }
}