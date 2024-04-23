package org.example;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxmlJsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

class Person {
    private String name;
    private int age;
    private String city;
    
    // getter and setters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCity() { return city; }
    // constructor, other methods etc...
}