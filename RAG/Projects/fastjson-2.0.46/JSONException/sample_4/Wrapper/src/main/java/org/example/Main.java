package org.example;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.TypeReference;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String json = "{\"name\":\"Joe\",\"age\":25}"; // An example JSON String
        Person p = JSON.parseObject(json, new TypeReference<Person>() {}); // Deserializing JSON to a Java Object
        System.out.println(p.getName() + " is " + p.getAge() + " years old."); // Output: Joe is 25 years old.

        String jsonList = "[{\"name\":\"John\",\"age\":30},{\"name\":\"Mary\",\"age\":22}]"; // An example list of JSON Strings
        List<Person> persons = JSON.parseArray(jsonList, new TypeReference<List<Person>>() {}); // Deserializing JSON List to a List of Java Objects
        for(Person person: persons){
            System.out.println(person.getName() + " is " + person.getAge() + " years old."); 
            // Output: John is 30 years old. Mary is 22 years old.
        }
    }
}