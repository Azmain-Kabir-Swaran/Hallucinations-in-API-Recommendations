package org.example;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Main implements HttpSessionBindingListener {

    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("Binding: " + event.getName());
    }

    public void valueUnbound(HttpSessionBindingEvent event) {
        System.outprintln("Unbinding: " + event.getName());
    }
}