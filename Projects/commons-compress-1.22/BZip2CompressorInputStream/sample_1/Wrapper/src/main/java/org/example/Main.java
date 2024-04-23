package org.example;


import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Open the file to be read
        FileInputStream fis = new FileInputStream("yourfile.bz2");

        // Open the BZip2 Compressor Input Stream on the file input stream
        BZip2CompressorInputStream bZip2CompressorInputStream = new BZip2CompressorInputStream(fis);

        // Initialize a Buffered Output Stream and a File Output Stream with the same file as the input
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("yourfile.txt"));

        // Byte Array to hold data during the transfer
        byte[] buffer = new byte[1024];

        // Transfer the compressed data to the uncompressed data in buffer
        int bytesRead;
        while ((bytesRead = bZip2CompressorInputStream.read(buffer)) != -1) {
            bos.write(buffer, 0, bytesRead);
        }

        // Close the streams
        bZip2CompressorInputStream.close();
        bos.close();
        fis.close();
    }
}