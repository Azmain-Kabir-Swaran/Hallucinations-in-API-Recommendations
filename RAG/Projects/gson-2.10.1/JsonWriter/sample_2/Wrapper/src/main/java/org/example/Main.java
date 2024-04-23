package org.example;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try (Writer writer = new FileWriter("output.json")) {
            JsonWriter jsonWriter = new JsonWriter(writer);
            jsonWriter.setIndent("    ");
            Map<String, Object> data = new HashMap<>();
            data.put("name", "John");
            data.put("age", 30);
            data.put("city", "New York");

            Gson gson = new GsonBuilder().create();
            gson.toJson(data, data.getClass(), jsonWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}