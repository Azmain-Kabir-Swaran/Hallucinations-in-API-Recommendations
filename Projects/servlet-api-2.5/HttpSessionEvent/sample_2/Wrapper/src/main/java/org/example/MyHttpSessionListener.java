package org.example;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.httpEventListener;

class MyHttpSessionListener implements HttpSessionListener {
    public void sessionCreated(HttpSessionEvent event) {
        System.out.println("Session is created.");
        // Add your code here for session creation 
    }

    public void sessionDestroyed(HttpSessionEvent event) {
        System.out.println("Session is destroyed.");
        // Add your code here for session destruction
    }
}