package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private String[] emails;
    private List<PhoneNumber> phoneNumbers;

    public Employee(int id, String name, String[] emails, List<PhoneNumber> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.emails = emails;
        this.phoneNumbers = phoneNumbers;
    }
}