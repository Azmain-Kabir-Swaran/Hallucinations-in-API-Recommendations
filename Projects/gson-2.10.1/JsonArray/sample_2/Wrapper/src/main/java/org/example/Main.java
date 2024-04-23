package org.example;


import java.lang.reflect.Type;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {
    public static void main(String[] args) {
        String json = "[ { \"name\": \"John\", \"age\": 30 }, { \"name\": \"Jane\", \"age\": 28 }, { \"name\": \"Bob\", \"age\": 35 } ]";
        
        Gson gson = new Gson();
        Type listType = new TypeToken<List<Person>>(){}.getType();
        
        List<Person> persons = gson.fromJson(json, listType);
        
        for(Person person : persons) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }
    }
}