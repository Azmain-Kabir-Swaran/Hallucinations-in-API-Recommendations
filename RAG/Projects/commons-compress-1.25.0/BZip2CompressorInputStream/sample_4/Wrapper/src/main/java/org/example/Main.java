package org.example;


import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        byte[] data = { /* your data to compress */ };
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(bais)) {

            byte[] buffer = new byte[1024];
            while (true) {
                int count = bzIn.read(buffer);
                if (count == -1) {
                    break;
                }
                // Process decompressed data.
            }
        }
    }
}