package org.example;


import java.util.*;
import org.apache.hadoop.conf.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration conf = new Configuration();

        // Set a property
        conf.set("name", "Hadoop");
        
        // Get the value of the property
        String value = conf.get("name");
        
        System.out.println(value); // prints "Hadoop"
    }
}