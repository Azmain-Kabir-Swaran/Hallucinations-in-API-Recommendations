package org.example;


import org.apache.log4j.spi.AppenderSkeleton;
import org.apache.log4j.spi.ErrorCode;
import org.apache.log4j.spi.LoggingEvent;

public class MyAppender extends AppenderSkeleton {

    protected MyAppender() {
    }

    @Override
    public void close() {
        // Close any resources
    }

    @Override
    public boolean requiresLayout() {
        return true;
    }

    @Override
    protected void append(LoggingEvent loggingEvent) {
        String message = this.layout.format(loggingEvent);
        System.out.println(message);
    }

    public static class Main {
        public static void main(String[] args) {
            // Assume this is already set up in your environment
            MyAppender myAppender = new MyAppender();
            myAppender.setLayout(new MyLayout());  // Your layout class will need to be implemented
            myAppender.setErrorHandler(new MyErrorHandler());  // Your error handler class needs to be implemented
            
            myAppender.activateOptions();
            
            // Use your logger
            org.apache.log4j.Logger.getRootLogger().addAppender(myAppender);

            // Log some messages
            org.apache.log4j.Logger.getRootLogger().debug("This is a debug message");
            org.apache.log4j.Logger.getRootLogger().info("This is an info message");
        }
    }

    // The layout and error handler classes will need to be implemented as needed.
    static class MyLayout implements org.apache.log4j.Layout {
        @Override
        public String format(LoggingEvent loggingEvent) {
            return loggingEvent.getMessage().toString();
        }

        @Override
        public boolean ignoresThrowable() {
            return false;
        }

        @Override
        public void activateOptions() {
        }
    }

    static class MyErrorHandler implements org.apache.log4j.spi.ErrorHandler {
        @Override
        public void error(String s) {
            System.out.println(s);
        }

        @Override
        public void error(String s, Exception e, int i) {
            System.out.println(s);
            System.out.println(e);
        }

        @Override
        public void setLogger(org.apache.log4j.Logger logger) {
            System.out.println("Setting logger: " + logger);
        }

        @Override
        public void error(String s, Throwable throwable, int i) {
            System.out.println(s);
            throwable.printStackTrace();
        }

        @Override
        public ErrorHandler getDefaultErrorHandler() {
            return null;
        }

        @Override
        public void setErrorHandler(ErrorHandler errorHandler) {
            System.out.println("Setting error handler: " + errorHandler);
        }
    }
}