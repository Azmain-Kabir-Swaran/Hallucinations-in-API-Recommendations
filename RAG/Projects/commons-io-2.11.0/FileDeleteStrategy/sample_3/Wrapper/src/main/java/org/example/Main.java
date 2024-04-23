package org.example;


import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.comparator.NameFileComparator;
import org.apache.commons.io.comparator.SizeFileComparator;
import org.apache.commons.io.filefilter.AgeFileFilter;
import org.apache.commons.io.filefilter.AndFileFilter;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.FileFileFilter;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.NotFileFilter;
import org.apache.commons.io.filefilter.OrFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;

public class Main {
    public static void main(String[] args) {
        File dir = new File(".");
        long ageMs = 24 * 60 * 60 * 1000; // 24 hours
        IOFileFilter ages = new AgeFileFilter(ageMs);
        IOFileFilter directories = DirectoryFileFilter.DIRECTORY;
        IOFileFilter files = FileFileFilter.FILE;
        IOFileFilter notDirectories = NotFileFilter.NOT_DIRECTORY;
        IOFileFilter suffixes = new SuffixFileFilter("txt");

        IOFileFilter filter = AndFileFilter.and(notDirectories, files, suffixes, ages);

        File[] dirFiles = dir.listFiles(filter);

        Arrays.sort(dirFiles, TrueFileFilter.TRUE.and(new LastModifiedFileComparator()));
        Arrays.sort(dirFiles, TrueFileFilter.TRUE.and(new SizeFileComparator()));
        Arrays.sort(dirFiles, TrueFileFilter.TRUE.and(new NameFileComparator()));

        IOFileFilter subDirFilter = AndFileFilter.and(directories, new NotFileFilter(suffixes));
        IOFileFilter allFilter = AndFileFilter.and(notDirectories, new NotFileFilter(new AgeFileFilter(ageMs)));

        File[] dirs = dir.listFiles(subDirFilter);
        for (File subDir : dirs) {
            // Do something with files in subdirectory
            File[] subDirFiles = subDir.listFiles(allFilter);
            for (File file : subDirFiles) {
                System.out.println("File: " + file.getName());
            }
        }
    }
}