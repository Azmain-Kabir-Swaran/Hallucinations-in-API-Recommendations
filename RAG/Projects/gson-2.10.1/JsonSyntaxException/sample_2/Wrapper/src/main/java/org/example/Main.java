package org.example;


import com.google.gson.*;
import com.google.gson.JsonSyntaxException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a JSON string:");
        String jsonString = scanner.nextLine();
        Gson gson = new Gson();

        try {
            JsonObject jsonObject = gson.fromJson(jsonString, JsonObject.class);
            System.out.println("Parsed JSON object: " + jsonObject.toString());
        } catch (JsonSyntaxException e) {
            System.out.println("Invalid JSON string: " + e.getMessage());
        }
    }
}