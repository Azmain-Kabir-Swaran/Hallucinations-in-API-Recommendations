package org.example;


import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        JsonReader reader = null;
        try {
            reader = new JsonReader(new FileReader("your_path_to_json_file.json"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        // Creating Gson object
        Gson gson = new Gson();

        // Convert JSON Object to Java Object
        JsonElement jsonElement = JsonParser.parseReader(reader);

        // Convert JSON array to list of User objects
        List<User> users = gson.fromJson(jsonElement, new TypeToken<List<User>>(){}.getType());

        // Print users
        for(User user : users){
            System.out.println(user);
        }
    }
}