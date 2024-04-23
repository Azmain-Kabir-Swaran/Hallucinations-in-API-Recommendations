package org.example;


import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BZip2CompressorOutputStream bzip2CompressorOutputStream = new BZip2CompressorOutputStream(byteArrayOutputStream);
        // Here you would actually use bzip2CompressorOutputStream for compression, for example:
        // bzip2CompressorOutputStream.write("Hello, World!".getBytes());
        bzip2CompressorOutputStream.finish();  // Flush output and finish compression
        bzip2CompressorOutputStream.close();  // Close output stream

        // At this point, the compressed data is available in byteArrayOutputStream
    }
}