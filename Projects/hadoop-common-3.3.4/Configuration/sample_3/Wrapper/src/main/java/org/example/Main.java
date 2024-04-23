package org.example;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS", "hdfs://localhost:9000"); 
        FileSystem fs = FileSystem.get(conf);

        conf.set("test.property", "testing property");
        System.out.println(conf.get("test.property"));
    }
}