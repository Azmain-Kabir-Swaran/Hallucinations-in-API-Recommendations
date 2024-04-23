package org.example;


import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        Gson gson = new Gson();
        
        try (JsonReader reader = new JsonReader(new FileReader("sample.json"))) {
            YourClass obj = gson.fromJson(reader, YourClass.class);
            // your code...
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}