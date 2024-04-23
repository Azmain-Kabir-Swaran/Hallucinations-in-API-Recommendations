package org.example;


import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File input = new File("input.txt");
            File output = new File("compressed.bz2");

            OutputStream out = new BZip2CompressorOutputStream(new FileOutputStream(output));
            InputStream in = new FileInputStream(input);

            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}