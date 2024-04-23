package org.example;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;

public class Main {
    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();

        // Set some configuration values here
        conf.set("key1", "value1");

        // You can now get configuration values
        String value = conf.get("key1");
        System.out.println(value); // Outputs: value1
    }
}