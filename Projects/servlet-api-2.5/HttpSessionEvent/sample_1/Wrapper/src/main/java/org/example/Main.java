package org.example;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class Main implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Session created");
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.out.println("Session destroyed");
    }
}