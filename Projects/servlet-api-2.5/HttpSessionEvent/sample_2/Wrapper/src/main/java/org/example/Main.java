package org.example;


import javax.servlet.http.HttpSessionEvent;
import javax.servlet.httpEventListener;

class Main {
    public static void main(String[] args) {
        HttpSessionEvent event = new HttpSessionEvent(new Object(), new javax.servlet.http.HttpSessionImpl());
        // The code for your event listener
        eventListener.sessionCreated(event);
    }
}