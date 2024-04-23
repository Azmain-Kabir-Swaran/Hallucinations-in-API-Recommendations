package org.example;


import org.apache.commons.io.FileSystem;
import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //Source folder
        File sourceDir = new File("C:\\path\\to\\source\\directory");
        
        //Target folder
        File targetDir = new File("C:\\path\\to\\target\\directory");

        // Using FileSystemUtils to copy a directory
        try {
            FileSystemUtils.copyDirectoryToDirectory(sourceDir, targetDir);
            System.out.println("Directory copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Using FileUtils to copy a directory (simplified version for clarity)
        try {
            FileUtils.copyDirectoryToDirectory(sourceDir, targetDir);
            System.out.println("Directory copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}