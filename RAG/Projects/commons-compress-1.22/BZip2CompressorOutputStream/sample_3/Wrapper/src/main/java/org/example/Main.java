package org.example;


import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;

public class Main {
    public static void main(String[] args) {
        // Input data
        String data = "This is some data to be compressed.";
        byte[] inputData = data.getBytes();
        
        try (OutputStream out = new FileOutputStream("output.bz2")) {
            // Compress data using BZip2
            try (BZip2CompressorOutputStream bzOut = new BZip2CompressorOutputStream(out)) {
                bzOut.write(inputData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            byte[] compressedData = Files.readAllBytes(Paths.get("output.bz2"));
            
            // Decompress data using BZip2
            BZip2CompressorOutputStream bzOut = new BZip2CompressorOutputStream(new FileOutputStream("decompressed.txt"));
            bzOut.write(compressedData);
            
            bzOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}