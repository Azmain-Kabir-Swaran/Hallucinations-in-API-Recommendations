package org.example;


import org.apache.commons.io.FileDeleteStrategy;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File directory = new File("path_to_directory"); // Replace "path_to_directory" with actual directory path

        try {
            deleteDirectory(directory, FileDeleteStrategy.FORCE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deleteDirectory(File directory, FileDeleteStrategy strategy) throws IOException {
        if (!directory.exists()) {
            return;
        }

        if (directory.isDirectory()) {
            File[] allContents = directory.listFiles();
            if (allContents != null) {
                for (File file : allContents) {
                    deleteDirectory(file, strategy);
                }
            }
        }

        strategy.deleteQuietly(directory);
    }
}