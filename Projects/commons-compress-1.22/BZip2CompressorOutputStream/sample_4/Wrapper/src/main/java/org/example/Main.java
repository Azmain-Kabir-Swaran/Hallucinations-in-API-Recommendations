package org.example;


import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            // Use BZip2CompressorOutputStream
            OutputStream out = new FileOutputStream("compressed.bz2");
            BZip2CompressorOutputStream bout = new BZip2CompressorOutputStream(out);

            // Compress data...
            String data = "Hello World!";
            byte[] bytes = data.getBytes();
            bout.write(bytes);
            
            // Ensure data is flushed and compressed
            bout.flush();
            bout.finish();

            // Ensure streams are closed
            bout.close();
            out.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}