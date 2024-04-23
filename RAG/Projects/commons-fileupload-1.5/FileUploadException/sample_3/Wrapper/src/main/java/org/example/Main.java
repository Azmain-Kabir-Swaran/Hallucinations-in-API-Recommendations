package org.example;


import java.io.IOException;
import org.apache.commons.fileupload.FileUploadException;

public class Main {

    public static void main(String[] args) {
        try {
            // Here you would call your file upload function or method, perhaps something like:
            // uploadFile(filePath);
            throw new FileUploadException("An error occurred during file upload");
        } catch (FileUploadException e) {
            // Handle the file upload exception
            System.out.println("FileUploadException occurred: " + e.getMessage());
        } catch (IOException e) {
            // Handle other I/O exceptions if required
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}