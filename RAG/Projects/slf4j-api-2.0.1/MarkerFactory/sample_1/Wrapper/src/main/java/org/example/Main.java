package org.example;


import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class Main {
    public static void main(String[] args) {
        Marker start = MarkerFactory.getMarker("START");
        Marker finish = MarkerFactory.getMarker("FINISH");

        Logger logger = LoggerFactory.getLogger(Main.class);

        logger.trace(start, "Trace Message");
        logger.debug(start, "Debug Message");
        logger.info(start, "Info Message");
        logger.warn(start, "Warn Message");
        logger.error(start, "Error Message");

        logger.trace(finish, "Trace Message");
        logger.debug(finish, "Debug Message");
        logger.info(finish, "Info Message");
        logger.warn(finish, "Warn Message");
        logger.error(finish, "Error Message");
    }
}