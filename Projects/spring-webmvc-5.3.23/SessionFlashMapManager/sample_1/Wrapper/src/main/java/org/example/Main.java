package org.example;


import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.FlashMapManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HttpServletRequest request = null; // provide appropriate request here
        HttpServletResponse response = null; // provide appropriate response here

        FlashMap flashMap = new FlashMap();
        flashMap.put("flashAttribute", "flashValue");

        FlashMapManager flashMapManager = new FlashMapManager();
        flashMapManager.saveOutputFlashMap(flashMap, request, response);
    }
}