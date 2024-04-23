package org.example;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            compressBZip2();
            deCompressBZip2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void compressBZip2() throws IOException {
        FileOutputStream fout = new FileOutputStream("out.bz2");
        BZip2CompressorOutputStream bzOut = new BZip2CompressorOutputStream(fout);
        FileInputStream in = new FileInputStream("input.txt");
        byte[] buffer = new byte[1024];
        int length;
        while ((length = in.read(buffer)) > 0) {
            bzOut.write(buffer, 0, length);
        }
        in.close();
        bzOut.close();
    }
    
    public static void deCompressBZip2() throws IOException {
        FileInputStream fin = new FileInputStream("out.bz2");
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(fin);
        FileOutputStream out = new FileOutputStream("decompressed.txt");
        byte[] buffer = new byte[1024];
        int length;
        while ((length = bzIn.read(buffer)) > 0) {
            out.write(buffer, 0, length);
        }
        bzIn.close();
        out.close();
    }
}