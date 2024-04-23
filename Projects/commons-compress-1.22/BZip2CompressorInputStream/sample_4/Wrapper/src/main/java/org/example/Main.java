package org.example;


import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

    public static void main(String[] args) {
        File bzFile = new File("/path-to-your-file.bz2");
        File outFile = new File("/path-to-output-file");

        try (InputStream is = new FileInputStream(bzFile);
             BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(is);
             OutputStream os = new FileOutputStream(outFile)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bzIn.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}