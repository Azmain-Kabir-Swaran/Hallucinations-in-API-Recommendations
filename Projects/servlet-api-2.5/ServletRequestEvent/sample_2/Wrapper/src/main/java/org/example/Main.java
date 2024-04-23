package org.example;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class Main implements HttpSessionListener, ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Servlet Request Initialized");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.outprintln("Servlet Request Destroyed");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Http Session Created");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("Http Session Destroyed");
    }
}