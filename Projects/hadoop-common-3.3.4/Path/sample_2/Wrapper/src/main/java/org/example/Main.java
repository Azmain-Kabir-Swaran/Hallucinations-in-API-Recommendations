package org.example;


import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.conf.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration conf = new Configuration();
        try {
            FileSystem fs = FileSystem.get(conf);

            // Get a file status
            Path file = new Path("hdfs://mycluster/path/to/myfile");
            System.out.println("File: " + fs.getFileStatus(file).getPath());

        } catch (Exception e) {
            System.err.println("Caught exception: " + e);
        }
    }
}