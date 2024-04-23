package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;

public class Main {

    private static final LoggerContext CTX = (LoggerContext) LogManager.getContext(false);

    public static void main(String[] args) {
        CTX.stop(); // or CTX.stop(1000) or CTX.stop(1000, TimeUnit.SECONDS)
        CTX.getConfiguration().getLoggerConfig("root").setLevel(Level.INFO);
    }
}