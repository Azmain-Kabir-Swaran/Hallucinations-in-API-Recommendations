package org.example;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("John Doe");
        user.setAge(30);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        try (JsonWriter writer = new JsonWriter(new FileWriter("user.json"))) {
            writer.beginObject();
            writer.name("user");
            writer.beginObject();
            
            writer.name("name").value(user.getName());
            writer.name("age").value(user.getAge());
            
            writer.endObject();
            writer.endObject();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}