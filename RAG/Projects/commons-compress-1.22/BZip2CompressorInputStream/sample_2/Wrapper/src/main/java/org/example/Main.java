package org.example;


import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("your_file.bz2");
            InputStream inputStream = new FileInputStream(file);
            BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(inputStream);

            byte[] content = new byte[1024];
            int bytesRead;
            while ((bytesRead = bzIn.read(content)) != -1) {
                // Process bytes read
            }

            bzIn.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}