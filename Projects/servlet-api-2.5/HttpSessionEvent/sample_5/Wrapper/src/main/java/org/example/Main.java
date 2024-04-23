package org.example;


import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class Main implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Session created.");
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        System.outystem.out.println("Session destroyed.");
    }

    public static void main(String[] args) {
        System.out.println("Main method called.");
    }
}