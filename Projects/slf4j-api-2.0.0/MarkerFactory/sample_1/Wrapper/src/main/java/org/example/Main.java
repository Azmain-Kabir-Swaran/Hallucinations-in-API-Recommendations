package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        // Creating a Logger object 
        Logger logger = LoggerFactory.getLogger(Main.class);

        // Creating a Marker object
        Marker marker = MarkerFactory.getMarker("Marker");

        // Logging with Marker
        logger.info(marker, "Logging with Marker");

        // Usage of DateTimeFormatter and LocalDateTime
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

    }
}