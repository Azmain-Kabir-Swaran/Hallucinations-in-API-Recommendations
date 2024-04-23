package org.example;


import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.FlashMapManager;
import org.springframework.web.servlet.support.SessionFlashMapManager;

public class Main {
    public static void main(String[] args) {
        HttpSession session = null;
        FlashMap flashMap = new FlashMap();
        FlashMapManager flashMapManager = new SessionFlashMapManager();
        
        flashMap.put("message", "Hello, world!");
        flashMapManager.saveOutputFlashMap(flashMap, session);
    }
}