package org.example;


import com.google.gson.Gson;
import com.google.gson.JsonIOException;

public class Main {
    public static void main(String[] args) throws JsonIOException {
        Gson gson = new Gson();

        // JSON to Java object
        String json = "{\"name\": \"John\", \"email\": \"john@example.com\"}";
        User user1 = gson.fromJson(json, User.class);

        // Java object to JSON
        User user2 = new User("John", "john@example.com");
        String user2Json = gson.toJson(user2);
    }
}