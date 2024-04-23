package org.example;


import org.osgi.framework.FrameworkEvent;
import org.osgi.framework.FrameworkListener;

public class Main {
    public static void main(String[] args) {
        FrameworkEvent event = new FrameworkEvent(1, "Test event");
        Listener listener = new Listener();
        
        listener.frameworkEvent(event);
    }
}