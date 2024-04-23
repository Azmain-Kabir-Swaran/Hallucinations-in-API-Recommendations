package org.example;


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import org.apache.commons.io.FileSystem;
import org.apache.commons.io.FileSystems;
import org.apache.commons.io.FileSystemUtils;

public class Main {
    public static void main(String[] args) throws IOException {
        // Create a temporary file in the system's temporary directory.
        FileSystem fs = FileSystems.getFileSystem(URI.create("temp:///"));
        Path tempFile = Files.createFile(fs.getPath("/file.txt"));

        // Write some content to the file
        Files.write(tempFile, "Hello, World! ".getBytes(), StandardOpenOption.WRITE);

        // Read content of the file
        byte[] content = Files.readAllBytes(tempFile);

        // Output the content
        System.out.println(new String(content));

        // Cleanup the created files.
        FileSystemUtils.deleteDirectory(fs.getPath("/"));
    }
}