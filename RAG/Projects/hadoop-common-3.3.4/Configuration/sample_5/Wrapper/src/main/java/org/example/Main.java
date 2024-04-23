package org.example;


import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class Main {

    public static void main(String[] args) throws IOException {
        Configuration conf = new Configuration();

        // Specify your Hadoop file system URI in the configuration
        conf.set("fs.defaultFS", "hdfs://localhost:9000");
        
        // Get the FileSystem instance from the Configuration
        FileSystem fs = FileSystem.get(conf);
        
        // Define the path
        Path path = new Path("/");
        
        // List files in the root directory
        FileStatus[] statuses = fs.listStatus(path);
        for (FileStatus status : statuses) {
            System.out.println(status.getPath().getName());
        }
    }
}