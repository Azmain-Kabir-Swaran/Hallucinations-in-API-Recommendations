package org.example;


import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileExistsException;
import org.apache.commons.io.FileUtils;

public class Main {
    public static void main(String[] args) {
        File file = new File("/path/to/your/file");
        try {
            FileUtils.forceMkdir(file);
        } catch (IOException e) {
            throw new FileExistsException("File already exists!");
        }
    }
}