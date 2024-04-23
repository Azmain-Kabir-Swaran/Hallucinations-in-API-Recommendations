package org.example;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class Main {
    public static void main(String[] args) throws Exception {

        Configuration conf = new Configuration();

        // Set up any other configuration parameters if needed
        conf.set("fs.defaultFS", "hdfs://localhost:9000");
        FileSystem hdfs = FileSystem.get(conf);
        Path file = new Path("/path/to/your/file");

        System.out.println(hdfs.exists(file) ? "File exists" : "File not found");
    }
}