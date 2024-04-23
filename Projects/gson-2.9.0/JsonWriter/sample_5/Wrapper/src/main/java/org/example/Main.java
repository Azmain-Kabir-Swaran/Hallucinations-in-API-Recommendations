package org.example;


import com.google.gson.stream.JsonWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            JsonWriter writer = new JsonWriter(new FileWriter("output.json"));
            writer.beginObject();  // Start of JSON object

            // Write key-value pair
            writer.name("name");
            writer.value("John Doe");

            // Write another key-value pair
            writer.name("age");
            writer.value(30);

            writer.endObject();  // End of JSON object
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}