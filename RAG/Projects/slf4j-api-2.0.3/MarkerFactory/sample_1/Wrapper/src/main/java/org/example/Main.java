package org.example;


import org.slf4j.MarkerFactory;
import org.slf4j.Marker;

public class Main {
   public static void main(String[] args) {
      // Creating a Marker instance
      Marker marker = MarkerFactory.getMarker("MY_MARKER");
      
      // Use the Marker
      // If logging is enabled for the Marker, this will be logged
      if(logger.isTraceEnabled(marker)) {
         logger.trace(marker, "My log message");
      }
   }
}