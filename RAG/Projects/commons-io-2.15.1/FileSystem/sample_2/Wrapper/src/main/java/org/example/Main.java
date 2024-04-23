package org.example;


import org.apache.commons.io.FileSystem;
import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File rootDir = new File("/"); // Replace "/" with your directory path.

        try {
            FileSystem fileSystem = FileSystemUtils.getFileSystem(rootDir);
            File dir = fileSystem.getRootDirectory();

            System.out.println("Root directory: " + dir);
            System.out.println("Free space (bytes): " + dir.getFreeSpace());
            System.out.println("Total space (bytes): " + dir.getTotalSpace());

            fileSystem.iterate(dir, TrueFileFilter.TRUE, (dir1, name, ioFileFilter) -> {
                System.out.println("File: " + dir1 + FileSystem.PREFIX + name);
                return true;
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}