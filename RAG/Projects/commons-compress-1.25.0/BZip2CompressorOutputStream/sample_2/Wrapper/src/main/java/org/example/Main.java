package org.example;


import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String data = "Hello, World!";

        FileOutputStream fileOut = new FileOutputStream("outfile.bz2");
        BZip2CompressorOutputStream bzip2Out = new BZip2CompressorOutputStream(fileOut);

        bzip2Out.write(data.getBytes());
        bzip2Out.close();
    }
}