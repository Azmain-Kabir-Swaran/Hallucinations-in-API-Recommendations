package org.example;


import com.google.gson.stream.JsonWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            JsonWriter writer = new JsonWriter(new FileWriter("your_file.json"));
            writer.beginObject();
            writer.name("name");
            writer.value("value");
            writer.endObject();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}