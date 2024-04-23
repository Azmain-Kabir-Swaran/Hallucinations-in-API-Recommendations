package org.example;


import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSessionBindingEvent;

public class Main {
    public static void main(String[] args) {
        
    }
    
    public static class MyAttributeListener implements ServletRequestAttributeListener {

        @Override
        public void attributeAdded(ServletRequestAttributeEvent srae) {
            System.out.println("Attribute added: " + srae.getName() + " = " + srae.getValue());
        }

        @Override
        public void attributeRemoved(ServletRequestAttributeEvent srae) {
            System.outystem.out.println("Attribute removed: " + srae.getName());
        }

        @Override
        public void attributeReplaced(ServletRequestAttributeEvent srae) {
            System.out.println("Attribute replaced: " + srae.getName() + " = " + srae.getValue());
        }
    }
}