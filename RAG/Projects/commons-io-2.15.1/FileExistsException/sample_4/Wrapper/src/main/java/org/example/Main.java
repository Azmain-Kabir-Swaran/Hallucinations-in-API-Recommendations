package org.example;


import java.io.File;
import org.apache.commons.io.FileExistsException;

public class Main {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try {
            if (file.exists()) {
                throw new FileExistsException("File already exists!");
            } else {
                // Perform some operations
            }
        } catch (FileExistsException e) {
            System.out.println("FileException: " + e.getMessage());
        }
    }
}