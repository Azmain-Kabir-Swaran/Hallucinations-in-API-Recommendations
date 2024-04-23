package org.example;


import org.apache.commons.io.FileExistsException;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        File dir = new File("/path-to-directory"); // replace with the actual directory path
        if (!dir.exists()) {
            try {
                throw new FileExistsException("File or directory does not exist!");
            } catch (FileExistsException e) {
                System.out.println("Caught FileExistsException: " + e.getMessage());
            }
        }
    }
}