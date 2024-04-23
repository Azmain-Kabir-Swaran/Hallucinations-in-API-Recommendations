package org.example;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequest;

public class Main implements ServletRequestAttributeListener {

    // Override all the listener methods of ServletRequestAttributeListener Interface 
    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        ServletRequest sr = srae.getServletRequest();
        String name = srae.getName();
        Object value = sr.getAttribute(name);
        System.out.println("Attribute added: " + name + " with value: " + value);
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        String name = srae.getName();
        System.out.println("Attribute removed: " + name);
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        String name = srae.getName();
        System.out.println("Attribute replaced: " + name);
    }
}