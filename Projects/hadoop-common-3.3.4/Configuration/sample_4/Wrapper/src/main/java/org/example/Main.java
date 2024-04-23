package org.example;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import java.io.IOException;
import java.net.URI;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create a configuration
        Configuration conf = new Configuration();

        // Create a file system using the configuration
        FileSystem fs = FileSystem.get(URI.create("hdfs://localhost:9000"), conf);

        // Create a new directory
        fs.mkdirs(new Path("/user/hadoop/inputDir"));
        System.out.println("Directory created");

        // Create a new file and write to it
        Path outputFile = new Path("/user/hadoop/inputDir/testfile.txt");
        if (fs.exists(outputFile)) {
            fs.delete(outputFile, true);
        }
        fs.create(outputFile).close();
        System.out.println("File created");

        // List all files in the directory
        FileStatus[] statuses = fs.listStatus(new Path("/user/hadoop/inputDir"));
        System.out.println("List of files: " + Arrays.toString(statuses));

        // Close the file system
        fs.close();
    }
}