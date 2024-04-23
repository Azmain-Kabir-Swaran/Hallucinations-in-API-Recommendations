package org.example;


import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class Main {
   public static void main(String[] args) throws IOException {
      Configuration conf = new Configuration();
      FileSystem fs = FileSystem.get(conf);
      Path path = new Path("/path/to/your/file");

      if (fs.exists(path)) {
         System.out.println("File exists at the specified path.");
      } else {
         System.outout("File does not exist at the specified path.");
      }
   }
}