package org.example;


import org.apache.hadoop.conf.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration conf = new Configuration();
        
        // Setting a new property
        conf.set("key", "value");
        
        // Getting an existing property
        String value = conf.get("key");
        System.out.println(value);
    }
}