package org.example;


import java.io.*;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import org.apache.commons.compress.utils.IOUtils;

public class Main {
    public static void main(String[] args) {
        FileInputStream fis = null;
        BZip2CompressorOutputStream bos = null;
        
        try {
            File f = new File("/path/to/your/file");
            fis = new FileInputStream(f);
            
            File fOut = new File("/path/to/your/compressed/file.bz2");
            FileOutputStream fos = new FileOutputStream(fOut);
            bos = new BZip2CompressorOutputStream(fos);
            
            IOUtils.copyLarge(fis, bos);
            
            System.out.println("Successfully compressed the file");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(fis);
            IOUtils.closeQuietly(bos);
        }
    }
}