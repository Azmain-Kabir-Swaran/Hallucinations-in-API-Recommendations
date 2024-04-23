package org.example;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            String str = "Hello World!";

            // Step 1: Create a byte array output stream
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

            // Step 2: Create a BZip2 compressor output stream
            BZip2CompressorOutputStream bZip2CompressorOutputStream = new BZip2CompressorOutputStream(byteArrayOutputStream);

            // Step 3: Write the string to the output stream
            bZip2CompressorOutputStream.write(str.getBytes());

            // Step 4: Flush and close the output stream
            bZip2CompressorOutputStream.flush();
            bZip2CompressorOutputStream.close();

            System.out.println("Compressed data size: " + byteArrayOutputStream.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}