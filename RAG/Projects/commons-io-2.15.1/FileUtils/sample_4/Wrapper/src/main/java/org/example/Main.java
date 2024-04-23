package org.example;


import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;
import java.io.File;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        // Get the current directory file object
        File directory = new File(".");

        // Get the list of files in the current directory
        Collection<File> files = FileUtils.listFiles(directory, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);

        // Print each file
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}