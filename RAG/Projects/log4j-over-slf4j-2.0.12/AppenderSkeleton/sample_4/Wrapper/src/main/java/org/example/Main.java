package org.example;


import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.Layout;
import org.apache.log4j.spi.ErrorCode;
import org.apache.log4j.spi.LoggingEvent;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class MyLogAppender extends AppenderSkeleton {

    private PrintWriter writer;

    public MyLogAppender(Layout layout) throws IOException {
        this.writer = new PrintWriter(new FileWriter("log.txt"));
    }

    @Override
    protected void append(LoggingEvent loggingEvent) {
        writer.println(layout.format(loggingEvent));
        writer.flush();
    }

    @Override
    public void close() {
        if(writer != null) {
            writer.close();
        }
    }

    @Override
    public boolean requiresLayout() {
        return true;
    }

    public static void main(String[] args) {
        try {
            MyLogAppender appender = new MyLogAppender(null);
            appender.addFilter(new org.apache.log4j.varia.LevelRangeFilter(org.apache.log4j.Level.INFO, org.apache.log4j.Level.INFO, false));
            appender.addFilter(new org.apache.log4j.varia.DenyAllFilter());
            org.apache.log4j.Logger.getRootLogger().addAppender(appender);
            org.apache.log4j.Logger.getRootLogger().setLevel(org.apache.log4j.Level.INFO);

            org.apache.log4j.Logger.getRootLogger().info("INFO message");
            org.apache.log4j.Logger.getRootLogger().debug("DEBUG message");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}