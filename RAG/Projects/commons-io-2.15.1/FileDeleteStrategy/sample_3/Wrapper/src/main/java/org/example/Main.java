package org.example;


import org.apache.commons.io.FileDeleteStrategy;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        String directoryPath = "/path/to/your/directory";
        deleteDirectoryContent(Paths.get(directoryPath));
    }

    public static void deleteDirectoryContent(Path directory) {
        try {
            Files.walk(directory, FileVisitOption.FOLLOW_LINKS)
                    .filter(p -> !Files.isDirectory(p))
                    .forEach(p -> {
                        try {
                            Files.delete(p);
                        } catch (IOException e) {
                            // Handle exception
                            e.printStackTrace();
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}