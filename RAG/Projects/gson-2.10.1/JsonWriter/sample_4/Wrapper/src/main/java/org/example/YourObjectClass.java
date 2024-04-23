package org.example;

import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class YourObjectClass {
    private String stringProperty;
    private int integerProperty;

    YourObjectClass(String stringProperty, int integerProperty) {
        this.stringProperty = stringProperty;
        this.integerProperty = integerProperty;
    }
}