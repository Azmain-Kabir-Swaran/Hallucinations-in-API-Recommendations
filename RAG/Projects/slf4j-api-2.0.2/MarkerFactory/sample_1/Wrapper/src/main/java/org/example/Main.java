package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MarkerFactory;
import org.slf4j.Marker;

public class Main {
  public static void main(String[] args) {
    Logger logger = LoggerFactory.getLogger(Main.class);
    Marker marker = MarkerFactory.getMarker("MY_MARKER");
    
    // use your logger and marker
    logger.info(marker, "This message has MY_MARKER attached");
    logger.info("This message does not have any marker attached");
  }
}