package org.example;

import org.osgi.framework.FrameworkEvent;
import org.osgi.framework.FrameworkListener;

class Listener implements FrameworkListener {
    public void frameworkEvent(FrameworkEvent event) {
        System.out.println("Framework event: " + event.getType());
    }
}