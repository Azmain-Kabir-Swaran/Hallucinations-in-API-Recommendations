package org.example;


import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("myfile.bz2")) {
            try (InputStream in = new BZip2CompressorInputStream(is)) {
                // read data from in
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}