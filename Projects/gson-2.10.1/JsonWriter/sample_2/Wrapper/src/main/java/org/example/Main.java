package org.example;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "John", new String[] { "john@example.com", "john.doe@example.com" }, 
            Arrays.asList(new PhoneNumber("home", "123456789"), new PhoneNumber("mobile", "987654321")));

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("employee.json")) {
            JsonWriter jsonWriter = new JsonWriter(writer);
            jsonWriter.setIndent("    "); // to make the json more human-readable
            gson.toJson(emp, Employee.class, jsonWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}