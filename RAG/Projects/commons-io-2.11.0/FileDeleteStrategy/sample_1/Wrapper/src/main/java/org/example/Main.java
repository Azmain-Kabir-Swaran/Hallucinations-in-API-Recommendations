package org.example;


import org.apache.commons.io.FileDeleteStrategy;

public class Main {

    public static void main(String[] args) {

        // Replace "sourceFile" with the path to your file
        File sourceFile = new File("sourceFile");

        // Delete the file using FileDeleteStrategy
        try {
            FileDeleteStrategy.FORCE.delete(sourceFile);
            System.out.println("File deleted successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}