package org.example;


import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.util.Streams;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File tempFile = null;
        FileOutputStream out = null;
        DiskFileItem fileItem = null;
        
        try {
            // Create a temporary file
            tempFile = File.createTempFile("temp", "txt");
            // Create a DiskFileItem from the temporary file
            fileItem = new DiskFileItem("fieldName", "", true, tempFile.getName(), "text/plain");
            
            // Write something into the file (e.g., "Hello, world!")
            out = new FileOutputStream(fileItem.getStoreLocation());
            out.write("Hello, world!".getBytes());
            out.flush();
            
            // Now fileItem has stored the content "Hello, world!" to a temporary file.
            // Now you can upload this file to the server (or process the file content as per your requirement).
            System.out.println("File content: " + Streams.asString(fileItem.get(), "UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}