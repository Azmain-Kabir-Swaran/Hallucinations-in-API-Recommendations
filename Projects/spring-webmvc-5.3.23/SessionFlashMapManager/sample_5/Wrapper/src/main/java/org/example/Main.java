package org.example;


import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.FlashMapManager;
import org.springframework.web.servlet.support.SessionFlashMapManager;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

public class Main {

    public static void main(String[] args) {
        MockHttpServletRequest request = new MockHttpServletRequest();
        MockHttpServletResponse response = new MockHttpServletResponse();

        FlashMap flashMap = new FlashMap();
        flashMap.put("message", "Hello, World!");

        FlashMapManager flashMapManager = new SessionFlashMapManager();
        flashMapManager.saveOutputFlashMap(flashMap, request, response);

        FlashMap outputFlashMap = flashMapManager.getOutputFlashMap(request);
        if (outputFlashMap != null) {
            String message = (String) outputFlashMap.get("message");
            System.out.println("Message from flash map: " + message);
        } else {
            System.out.println("No message in flash map.");
        }
    }
}