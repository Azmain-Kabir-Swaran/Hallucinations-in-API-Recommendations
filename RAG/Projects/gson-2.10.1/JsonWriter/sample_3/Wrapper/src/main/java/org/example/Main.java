package org.example;


import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> employee = new HashMap<>();
        employee.put("name", "John");
        employee.put("department", "IT");
        
        Gson gson = new Gson();

        try (JsonWriter writer = new JsonWriter(new FileWriter("employee.json"))) {
            gson.toJson(employee, writer.getClass());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}