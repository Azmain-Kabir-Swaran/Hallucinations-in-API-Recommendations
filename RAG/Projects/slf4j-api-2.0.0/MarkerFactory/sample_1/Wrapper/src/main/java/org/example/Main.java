package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MarkerFactory;

public class Main {
    final static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.debug(MarkerFactory.getMarker("Start Application..."), "Started");
        logger.info(MarkerFactory.getMarker("Process Application..."), "Processing");
        logger.error(MarkerFactory.getMarker("Error Application..."), "Application Error", new Exception("App error"));
    }
}