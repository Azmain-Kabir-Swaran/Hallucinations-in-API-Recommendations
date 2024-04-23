package org.example;


import java.io.*;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;

public class Main {
    public static void main(String[] args) {
        try {
            // File to be decompressed
            File file = new File("/path/to/compressed/file");
            FileInputStream fis = new FileInputStream(file);
            BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(fis);

            // Output file
            FileOutputStream fos = new FileOutputStream("/path/to/decompressed/file");

            byte[] buffer = new byte[1024];
            int length;
            // write the decompressed data to another file
            while ((length = bzIn.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }

            bzIn.close();
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}