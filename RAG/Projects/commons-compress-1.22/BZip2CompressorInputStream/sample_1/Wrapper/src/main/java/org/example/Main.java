package org.example;


import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("input.txt");
        File outputFile = new File("compressed.bz2");

        try (FileInputStream fileInputStream = new FileInputStream(inputFile);
             BZip2CompressorInputStream bZip2CompressorInputStream = new BZip2CompressorInputStream(fileInputStream);
             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();) {

            byte[] buffer = new byte[1024];
            int len;

            while ((len = bZip2CompressorInputStream.read(buffer)) > 0) {
                byteArrayOutputStream.write(buffer, 0, len);
            }

            try (FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {
                fileOutputStream.write(byteArrayOutputStream.toByteArray());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Files.deleteIfExists(Paths.get(inputFile.getAbsolutePath()));
            Files.deleteIfExists(Paths.get(outputFile.getAbsolutePath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}