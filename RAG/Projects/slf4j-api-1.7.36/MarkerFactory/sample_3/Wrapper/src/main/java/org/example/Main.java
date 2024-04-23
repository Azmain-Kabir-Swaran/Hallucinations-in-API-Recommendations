package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class Main {

  private static final Logger logger = LoggerFactory.getLogger(Main.class);
  private static final Marker EXECUTION_TIME_MARKER = MarkerFactory.getMarker("EXECUTION_TIME");

  public static void main(String[] args) {
    logger.info(EXECUTION_TIME_MARKER, "Execution Started");

    long startTime = System.currentTimeMillis();

    // do some work

    long endTime = System.currentTimeMillis();

    logger.info(EXECUTION_TIME_MARKER, "Execution Ended. Execution time: {} ms", (endTime - startTime));
  }
}