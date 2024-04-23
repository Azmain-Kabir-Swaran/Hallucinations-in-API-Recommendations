package org.example;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws JsonSyntaxException, IOException {

        String jsonString = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";

        try {
            JsonObject json = new JsonParser().parse(jsonString).getAsJsonObject();
            System.out.println(json);
        } catch (JsonSyntaxException e) {
            System.out.println("Invalid JSON");
            throw e;
        }
    }
}