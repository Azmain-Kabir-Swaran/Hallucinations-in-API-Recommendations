package org.example;


import com.google.gson.JsonIOException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws JsonIOException {
        try {
            // your code here
        } catch (IOException e) {
            // handle IOException
            throw new JsonIOException(e);
        }
    }
}