package org.example;


import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String sample = "Sample text to compress";
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            try (BZip2CompressorOutputStream bzipOut = new BZip2CompressorOutputStream(out)) {
                bzipOut.write(sample.getBytes());
            }
            System.out.println(out.toByteArray().length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}