package org.example;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class Main {

    public static void main(String[] args) throws Exception {
        // Create a new configuration object
        Configuration conf = new Configuration();

        // Set configuration properties
        conf.set("fs.defaultFS", "hdfs://localhost:9000");

        // Get a FileSystem instance from the configuration
        FileSystem fs = FileSystem.get(conf);

        // Get the file status of a file
        Path file = new Path("/path/to/your/file");
        if (fs.exists(file)) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }
    }
}