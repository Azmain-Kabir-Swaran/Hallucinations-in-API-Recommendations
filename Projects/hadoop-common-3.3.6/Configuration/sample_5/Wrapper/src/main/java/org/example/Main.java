package org.example;


import org.apache.hadoop.conf.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration conf = new Configuration();
        conf.addResource(new Path("hdfs-site.xml"));
        conf.addResource(new Path("core-site.xml"));
        
        String fsUri = conf.get("fs.default.name");
        System.out.println(fsUri);
    }
}