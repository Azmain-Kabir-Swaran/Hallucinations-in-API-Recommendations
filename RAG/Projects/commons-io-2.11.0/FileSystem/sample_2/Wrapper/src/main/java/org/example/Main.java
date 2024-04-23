package org.example;


import org.apache.commons.io.FileSystem;
import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException {
        File rootDirectory = new File("/path/to/directory");
        IOFileFilter allFiles = FileFilterUtils.and(FileFilterUtils.fileFileFilter(), FileFilterUtils.directoryFileFilter());
        FileAlterationObserver observer = new FileAlterationObserver(rootDirectory, allFiles);
        
        FileAlterationMonitor monitor = new FileAlterationMonitor(TimeUnit.SECONDS.toMillis(60));
        monitor.addObserver(observer);
        monitor.start();

        FileSystem fs = FileSystem.getFileSystem(rootDirectory.toURI());
        System.out.println("Total space: " + fs.getTotalSpace());
        System.out.println("Usable space: " + fs.getUsableSpace());
        System.out.println("Unallocated space: " + fs.getUnallocatedSpace());
    }
}