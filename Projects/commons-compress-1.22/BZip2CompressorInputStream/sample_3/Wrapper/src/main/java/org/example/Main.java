package org.example;


import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File compressedFile = new File("example.bz2"); // Replace with your file path
        File uncompressedFile = new File("example_uncompressed.txt");

        try (InputStream inputStream = new BZip2CompressorInputStream(new FileInputStream(compressedFile));
             FileOutputStream outputStream = new FileOutputStream(uncompressedFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}