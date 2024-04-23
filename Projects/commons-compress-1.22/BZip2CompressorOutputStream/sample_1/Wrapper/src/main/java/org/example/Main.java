package org.example;


import java.io.*;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        // Create a source file
        File sourceFile = new File("source.txt");
        // Create an output stream to compress the source file into a .bz2 file
        BZip2CompressorOutputStream bcos = new BZip2CompressorOutputStream(new FileOutputStream("source.txt.bz2"));

        // Create a buffered output stream
        BufferedOutputStream bos = new BufferedOutputStream(bcos);

        // Create an input stream to read the source file
        FileInputStream fis = new FileInputStream(sourceFile);

        byte[] buf = new byte[1024];
        int len;
        // Read the source file and write to the output stream
        while ((len = fis.read(buf)) > 0) {
            bos.write(buf, 0, len);
        }

        // Close the streams
        bos.close();
        bcos.close();
        fis.close();
    }
}