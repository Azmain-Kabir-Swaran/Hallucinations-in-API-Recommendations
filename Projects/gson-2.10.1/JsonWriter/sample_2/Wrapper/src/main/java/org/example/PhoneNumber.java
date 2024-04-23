package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class PhoneNumber {
    private String type;
    private String number;

    public PhoneNumber(String type, String number) {
        this.type = type;
        this.number = number;
    }
}