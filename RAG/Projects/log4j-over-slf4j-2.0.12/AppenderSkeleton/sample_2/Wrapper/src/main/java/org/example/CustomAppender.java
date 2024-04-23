package org.example;

import org.slf4j.event.Level;
import org.slf4j.Marker;
import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;
import org.apache.log4j.spi.ThrowableInformation;

public class CustomAppender extends AppenderSkeleton {

    @Override
    public void close() {
        // close resources if any
    }

    @Override
    public boolean requiresLayout() {
        return false;
    }

    @Override
    protected void append(LoggingEvent event) {
        StringBuilder sb = new StringBuilder();

        sb.append("Level: " + Level.toLevel(event.getLevel()) + "\n");
        sb.append("Logger Name: " + event.getLoggerName() + "\n");
        sb.append("TimeStamp: " + event.getTimeStamp() + "\n");
        sb.append("ThreadName: " + event.getThreadName() + "\n");
        sb.append("Message: " + event.getMessage() + "\n");

        ThrowableInformation info = event.getThrowableInformation();
        if (info != null) {
            Throwable throwable = info.getThrowable();
            if (throwable != null) {
                sb.append("Throwable: " + throwable.getMessage() + "\n");
            }
        }

        Marker marker = event.getMarker();
        if (marker != null) {
            sb.append("Marker: " + marker.getName() + "\n");
        }

        System.out.println(sb.toString());
    }
}