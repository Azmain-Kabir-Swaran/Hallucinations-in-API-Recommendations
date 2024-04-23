package org.example;


import org.apache.commons.io.FileSystem;
import org.apache.commons.io.FileSystemUtils;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("your/file/path");
        FileSystem fileSystem = FileSystems.getFileSystem(path);
        FileSystemUtils.usage(fileSystem);
    }
}