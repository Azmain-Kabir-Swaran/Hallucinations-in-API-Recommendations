package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;

public class Main {

    public static void main(String[] args) {

        // Using LoggerContext
        LoggerContext context = (LoggerContext) LogManager.getContext(false);
        context.setConfiguration(...); // Your configuration goes here
    }
}