package org.example;


import org.apache.commons.fileupload.FileUploadException;

public class Main {
    public static void main(String[] args) {
        try {
            throw new FileUploadException("Custom error message");
        } catch (FileUploadException e) {
            System.out.println("Caught FileUploadException: " + e.getMessage());
        }
    }
}