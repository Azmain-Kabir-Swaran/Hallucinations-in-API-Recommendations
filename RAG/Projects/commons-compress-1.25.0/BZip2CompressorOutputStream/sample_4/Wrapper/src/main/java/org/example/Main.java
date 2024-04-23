package org.example;


import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "sample.txt";
        String outputFileName = "compressed.bz2";

        try (BufferedOutputStream out = new BufferedOutputStream(
                new FileOutputStream(outputFileName))) {

            try (BZip2CompressorOutputStream bzOut = new BZip2CompressorOutputStream(out)) {

                try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(bzOut))) {

                    writer.write("Some text to compress and write to a BZip2 file.");

                }
            }
        } catch (IOException ex) {
            System.err.println("Error: " + ex);
        }
    }
}