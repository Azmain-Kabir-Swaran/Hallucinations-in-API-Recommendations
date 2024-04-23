package org.example;


import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(conf);

        // Create a new file
        Path file = new Path("/user/myuser/myfile");
        fs.createNewFile(file);

        // Print out its full path
        System.out.println("File Path: " + file.toUri().toURL().toString());

        // Delete the file
        fs.delete(file, true);
    }
}