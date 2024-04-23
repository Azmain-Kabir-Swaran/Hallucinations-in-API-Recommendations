package org.example;


import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.FlashMapManager;
import org.springframework.web.servlet.support.SessionFlashMapManager;
import javax.servlet.http.HttpSession;

public class Main {

    public static void main(String[] args) {

        // HttpSession is provided elsewhere and injected as a dependency
        // HttpSession session = ...

        // A session specific flash scope needs to be created
        FlashMapManager flashMapManager = new SessionFlashMapManager();
        FlashMap flashMap = flashMapManager.retrieveFlashMap(session);

        // The session's flash map is now retrievable
        if (flashMap != null) {
            System.out.println("Flash map present.");
            // Use the FlashMap as needed...
        }

        // Add some data to the flash scope
        flashMap.put("key", "value");

        // The flashMap now contains the key "key" with value "value"
        // Store the modified FlashMap back in the session
        flashMapManager.saveOutputFlashMap(flashMap, session);

        // The session's FlashMap now has the key-value pair we just put in
        // You can also remove keys or clear the entire FlashMap
    }
}