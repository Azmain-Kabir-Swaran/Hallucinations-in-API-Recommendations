package org.example;


import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import org.apache.commons.compress.utils.IOUtils;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // source file
        File sourceFile = new File("source.txt");

        // compressed file
        File compressedFile = new File("compressed.bz2");
        
        // uncompressed file
        File uncompressedFile = new File("uncompressed.txt");

        try {
            // compress file
            compressFile(sourceFile, compressedFile);
            
            // uncompress file
            uncompressFile(compressedFile, uncompressedFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void compressFile(File source, File destination) throws IOException {
        try (InputStream in = new FileInputStream(source);
             OutputStream out = new BZip2CompressorOutputStream(Files.newOutputStream(Paths.get(destination.getPath())))) {
            IOUtils.copy(in, out);
        }
    }

    public static void uncompressFile(File source, File destination) throws IOException {
        try (InputStream in = new BZip2CompressorInputStream(Files.newInputStream(Paths.get(source.getPath())));
             OutputStream out = new FileOutputStream(destination)) {
            IOUtils.copy(in, out);
        }
    }
}