package org.example;


import java.io.*;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;

public class Main {
    public static void main(String[] args) {
        File inputFile = new File("input.txt"); // Replace with your source file
        File outputFile = new File("output.txt.bz2"); // Replace with your destination file
        
        try {
            InputStream inputStream = new FileInputStream(inputFile);
            OutputStream outputStream = new FileOutputStream(outputFile);
            
            // Wrap the file output stream with a bzip2 output stream
            OutputStream bzip2Output = new BZip2CompressorOutputStream(outputStream);
            
            // Compress file
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                bzip2Output.write(buffer, 0, bytesRead);
            }
            
            bzip2Output.finish();  // Important: Don't forget to call finish
            
            bzip2Output.close();
            outputStream.close();
            inputStream.close();
            
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}