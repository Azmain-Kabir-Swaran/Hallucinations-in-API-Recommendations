package org.example;


import com.fasterxml.jackson.core.JsonLocation;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        JsonLocation location = new JsonLocation("file", 1, 1, 1);
        System.out.println("File Name: " + location.getFileName());
        System.out.println("Line Number: " + location.getLineNr());
        System.out.println("Column Number: " + location.getColumnNr());
        System.out.println("Charater Offset: " + location.getCharacterOffset());
    }
}