package org.example;


import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedOutputStream bos = new BufferedOutputStream(
                new BZip2CompressorOutputStream(Files.newOutputStream(Paths.get("output.bz2"))));
                sos = new PrintStream(bos)) {
            sos.println("Some text to be compressed.");
        }
    }
}