package org.example;


import jakarta.mail.internet.MimeUtility;
import jakarta.activation.DataSource;
import jakarta.activation.FileDataSource;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        DataSource fileDataSource = new FileDataSource("file.txt");
        String encodedString = MimeUtility.encodeText(fileDataSource, "utf-8", "B");
        System.out.println("Encoded String: " + encodedString);
    }
}