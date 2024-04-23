package org.example;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.Date;

public class AttributeListener implements ServletRequestAttributeListener {
    public AttributeListener() {
        super();
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent event) {
        System.out.println("Attribute " + event.getName() + " added with value " + event.getValue());
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent event) {
        System.out.println("Attribute " + event.getName() + " removed.");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent event) {
        System.out.println("Attribute " + event.getName() + " replaced with value " + event.getValue());
    }
}