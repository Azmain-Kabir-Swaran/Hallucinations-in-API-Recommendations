package org.example;


import org.apache.hadoop.conf.Configuration;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Configuration conf = new Configuration();

        conf.addResource(new Path("/path/to/your/resources/core-site.xml"));
        conf.addResource(new Path("/path/to/your/resources/hdfs-site.xml"));

        conf.set("fs.default.name", "hdfs://your-namenode:port");

        conf.set("mapreduce.app-submission.cross-platform", "true");

        System.out.println(conf.get("fs.default.name"));
        System.out.println(conf.get("mapreduce.app-submission.cross-platform"));
    }
}