package org.example;


import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        File rootDirectory = new File("path-to-your-directory");
        if (rootDirectory.exists() && rootDirectory.isDirectory()) {
            File[] files = FileUtils.listFiles(rootDirectory, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);
            for (File file : files) {
                System.out.println(file.getAbsolutePath());
            }
        } else {
            System.out.println("Invalid directory path.");
        }
    }
}