package org.example;


import org.apache.commons.fileupload.FileUploadException;
import java.util.Collection;

public class Main {
    public static void main(String[] args) throws FileUploadException {
        throw new FileUploadException("This is a sample FileUploadException");
    }
}