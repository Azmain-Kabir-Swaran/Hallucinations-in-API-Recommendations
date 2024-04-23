package org.example;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import java.util.Map;

public class Main extends Configured {

    public static void main(String[] args) {
        Configuration conf = new Configuration();
        Map<String, String> map = conf.getMapReduceJobConfig();
        
        // Fetch hadoop configuration information
        String jobTracker = conf.get("mapreduce.job.tracker");

        System.out.println("Job Tracker: " + jobTracker);
    }
}