package org.example;


import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.Context;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.Level;

public class Main {

    public static void main(String[] args) {
        // get a LoggerContext instance which represents the current context
        LoggerContext lc = (LoggerContext) Context.getDefaultManagementContext();

        // get existing logger (using the name of the logger)
        Logger logger = lc.getLogger("ch.qos.logback.classic.Level");

        // set the logger to a new level (e.g., DEBUG)
        logger.setLevel(Level.DEBUG);

        // print the new level
        System.out.println(logger.getName() + " changed level to " + logger.getLevel());
    }
}