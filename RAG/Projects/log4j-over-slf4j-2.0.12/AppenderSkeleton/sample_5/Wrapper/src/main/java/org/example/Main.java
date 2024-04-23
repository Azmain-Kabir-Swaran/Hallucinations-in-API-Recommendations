package org.example;


import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;

public class Main extends AppenderSkeleton {
    
    public Main() {
        this.name = "MyFirstAppender";
    }
    
    protected void append(LoggingEvent loggingEvent) {
        System.out.println(this.layout.format(loggingEvent));
    }

    public void close() {
        // nothing to do yet
    }

    public boolean requiresLayout() {
        return true;
    }

    public static void main(String[] args) {
        Main myAppender = new Main();
        myAppender.setLayout(new org.apache.log4j.PatternLayout("%m%n"));
        myAppender.addFilter(new org.apache.log4j.varia.LevelRangeFilter());
        myAppender.activateOptions();

        // Your code here
    }
}