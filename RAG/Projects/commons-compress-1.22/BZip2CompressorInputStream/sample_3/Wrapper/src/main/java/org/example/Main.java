package org.example;


import java.io.File;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("path_to_your_file.bz2");
            File outputFile = new File("path_to_output_file");

            // Create a BZip2CompressorInputStream from the input file
            try (InputStream in = new BZip2CompressorInputStream(new FileInputStream(file));
                 OutputStream out = new FileOutputStream(outputFile)) {
                // Copy bytes from the compressed file to the output file
                byte[] buf = new byte[1024];
                int len;
                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}