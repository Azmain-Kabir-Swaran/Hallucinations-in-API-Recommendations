package org.example;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        // Initialize the input data.
        String input = "Sample data to compress with BZip2.";

        // Prepare the byte stream for BZip2 compression.
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BZip2CompressorOutputStream bzip2OutputStream = new BZip2CompressorOutputStream(byteArrayOutputStream);
        bzip2OutputStream.write(input.getBytes());
        bzip2OutputStream.close();

        // Get the compressed data.
        byte[] outputBytes = byteArrayOutputStream.toByteArray();

        // Print out the compressed data.
        for (byte outputByte : outputBytes) {
            System.out.print(outputByte + " ");
        }
    }
}