package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

class Person {
    private String name;
    private int age;
    private String city;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}