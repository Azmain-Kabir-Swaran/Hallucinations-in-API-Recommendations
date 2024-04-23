package org.example;


import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import org.apache.commons.io.FileSystem;
import org.apache.commons.io.filefilter.TrueFileFilter;

public class Main {
    public static void main(String[] args) {
        Path rootDir = Paths.get("C:\\"); // Replace this with your directory
        try {
            Files.walkFileTree(rootDir, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                    System.out.println(file.toString());
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}