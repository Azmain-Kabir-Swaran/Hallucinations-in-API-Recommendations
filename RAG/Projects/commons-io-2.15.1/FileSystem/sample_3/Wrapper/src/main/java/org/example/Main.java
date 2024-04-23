package org.example;


import org.apache.commons.io.FileSystem;
import org.apache.commons.io.FileSystemUtils;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileSystem fileSystem = FileSystem.getFileSystem(new File("test"));
        try {
            System.out.println("Total space: " + FileSystemUtils.sizeOfDirectory(new File("test")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}