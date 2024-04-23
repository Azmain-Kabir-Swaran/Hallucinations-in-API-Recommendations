package org.example;


import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.FlashMapManager;

public class Main {
    public static void main(String[] args) {
        // Creates a FlashMap
        FlashMap flashMap = new FlashMap();
        flashMap.put("attr1", "value1");
        flashMap.put("attr2", "value2");

        // Assume we have a FlashMapManager available
        FlashMapManager flashMapManager = new FlashMapManager();

        // Add the FlashMap to the session
        flashMapManager.saveOutputFlashMap(flashMap, new MockHttpServletRequest(), new MockHttpServletResponse());

        // Get the FlashMap from the session
        FlashMap retrievedFlashMap = flashMapManager.retrieveAndPurge(new MockHttpServletRequest(), new MockHttpServletResponse());

        // Print the retrieved attributes
        System.out.println(retrievedFlashMap.get("attr1"));
        System.out.println(retrievedFlashMap.get("attr2"));
    }
}