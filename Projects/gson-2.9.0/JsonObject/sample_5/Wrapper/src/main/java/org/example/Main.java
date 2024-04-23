package org.example;


import com.google.gson.JsonObject;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main {

    public static void main(String[] args) {
        JsonObject obj = new JsonObject();

        obj.addProperty("name", "John");
        obj.addProperty("age", 30);
        obj.addProperty("country", "USA");

        try (Writer writer = new FileWriter("output.json")) {
            com.google.gson.JsonParser.parseString(obj.toString()).getAsJsonObject().writeTo(writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}