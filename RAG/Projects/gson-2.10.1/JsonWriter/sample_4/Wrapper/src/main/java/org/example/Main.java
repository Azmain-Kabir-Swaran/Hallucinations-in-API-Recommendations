package org.example;


import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

    public static void main(String[] args) {

        YourObjectClass object = new YourObjectClass("Hello", 123);

        Gson gson = new GsonBuilder().create();

        try (FileWriter writer = new FileWriter("jsonFileName.json")) {
            gson.toJson(object, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}