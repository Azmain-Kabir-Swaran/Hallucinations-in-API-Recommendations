package org.example;


import org.apache.commons.fileupload.FileUploadException;

public class Main {
    public static void main(String[] args) {
        try {
            throw new FileUploadException();
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
    }
}