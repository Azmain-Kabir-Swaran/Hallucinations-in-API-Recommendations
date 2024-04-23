package org.example;


import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String input = "Example text to compress";
        String bzip2File = "bzip2file.bz2";

        try (FileOutputStream fos = new FileOutputStream(bzip2File);
             BZip2CompressorOutputStream bcos = 
               new BZip2CompressorOutputStream(fos)) {
            bcos.write(input.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}