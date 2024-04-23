package org.example;


import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        // Use a try-with-resources statement to automatically close the input streams.
        try (InputStream in = new BufferedInputStream(new FileInputStream("input.bz2"));
             BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(in);) {

            // Now you can read the decompressed data from the input stream.
            int data;
            while ((data = bzIn.read()) != -1) {
                // process the byte data
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}