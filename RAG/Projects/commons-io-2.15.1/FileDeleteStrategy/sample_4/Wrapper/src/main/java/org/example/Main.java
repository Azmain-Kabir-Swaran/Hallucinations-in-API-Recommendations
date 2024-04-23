package org.example;


import java.io.File;
import org.apache.commons.io.FileDeleteStrategy;
import org.apache.commons.io.filefilter.TrueFileFilter;

public class Main {

    public static void main(String[] args) throws Exception {

        // Create a new File instance
        File fileToDelete = new File("/path/to/file");

        // Check if the file exists
        if (!fileToDelete.exists()) {
            System.out.println("File does not exist");
            return;
        }

        // Delete the file
        FileDeleteStrategy.INSTANCE.delete(fileToDelete);

        System.out.println("File has been deleted successfully");
    }
}