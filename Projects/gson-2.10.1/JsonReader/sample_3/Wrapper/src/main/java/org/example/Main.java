package org.example;


import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        JsonParser jsonParser = new JsonParser();
        JsonElement jsonElement = jsonParser.parse(new FileReader("file.json"));
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        
        // access the data from the JsonObject
        String name = jsonObject.get("name").getAsString();
        int age = jsonObject.get("age").getAsInt();
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}