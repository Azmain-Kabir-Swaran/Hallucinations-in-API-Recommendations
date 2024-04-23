package org.example;


import javax.servlet.*;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionAttributeListener;

public class Main implements ServletRequestAttributeListener {

    public static void main(String[] args) {
        // Testing the functionality here
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("Attribute added: " + srae.getName());
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("Attribute removed: " + srae.getName());
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("Attribute replaced: " + srae.getName());
    }
}