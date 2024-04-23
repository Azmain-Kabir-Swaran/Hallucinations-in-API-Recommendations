package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;

public class Main {
    public static void main(String[] args) {
        // get the context of your logger
        final LoggerContext context = (LoggerContext) LogManager.getContext(false);
        // retrieve the configuration
        Configuration config = context.getConfiguration();
        // manipulate the configuration 
        ...
        // set new configuration
        context.setConfiguration(config);
    }
}