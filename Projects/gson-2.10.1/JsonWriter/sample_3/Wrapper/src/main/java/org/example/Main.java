package org.example;


import com.google.gson.stream.JsonWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            // Creating JsonWriter
            JsonWriter writer = new JsonWriter(new FileWriter("sample.json"));

            writer.beginObject();

            writer.name("name").value("John Doe");
            writer.name("age").value(30);
            writer.name("city").value("New York");

            writer.name("address");
            writer.beginObject();
            writer.name("street").value("123 Street");
            writer.name("zipCode").value("12345");
            writer.endObject();

            writer.name("interests");
            writer.beginArray();
            writer.value("Travel");
            writer.value("Sports");
            writer.value("Music");
            writer.endArray();

            writer.endObject();

            // Flush and Close the JsonWriter
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}