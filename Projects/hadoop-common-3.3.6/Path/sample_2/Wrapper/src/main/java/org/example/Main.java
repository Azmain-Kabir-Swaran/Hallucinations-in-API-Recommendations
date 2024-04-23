package org.example;


import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.conf.Configuration;

public class Main {
    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(conf);
        
        String tempDir = fs.getTemporaryDirectory().toString();
        Path dir = new Path(tempDir);
        
        if (fs.mkdirs(dir)) {
            System.out.println("Directory created successfully.");
        } else {
            System.out.println("Directory already exists.");
        }
    }
}