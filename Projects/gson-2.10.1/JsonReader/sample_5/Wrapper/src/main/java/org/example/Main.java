package org.example;


import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.IOException;
import java.io.StringReader;

public class Main {

    public static void main(String[] args) throws IOException {
        String jsonString = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
        JsonReader reader = new JsonReader(new StringReader(jsonString));

        Gson gson = new Gson();
        Person person = gson.fromJson(reader, Person.class);

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getCity());
    }
}