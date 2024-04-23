package org.example;


import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Main implements HttpSessionBindingListener {

    // Implementing the session-bound listener
    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("Attribute bound: " + event.getName());
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.outem.out.println("Attribute unbound: " + event.getName());
    }

    // Main function
    public static void main(String[] args) {
        System.out.println("The program runs correctly");
    }
}