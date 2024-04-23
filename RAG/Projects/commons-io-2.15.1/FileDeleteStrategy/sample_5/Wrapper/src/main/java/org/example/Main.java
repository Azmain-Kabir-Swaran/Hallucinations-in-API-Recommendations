package org.example;


import org.apache.commons.io.FileDeleteStrategy;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File directory = new File("directory_path");
        deleteDirectory(directory);
    }

    public static void deleteDirectory(File directoryToBeDeleted) {
        FileDeleteStrategy strategy = new FileDeleteStrategy();
        FileUtils.emptyDirectory(directoryToBeDeleted);
        strategy.deleteQuietly(directoryToBeDeleted);
    }
}