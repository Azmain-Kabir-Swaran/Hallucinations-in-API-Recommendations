package org.example;


import com.google.gson.JsonIOException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Your code here
            throw new JsonIOException("This is an JsonIOException example");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}