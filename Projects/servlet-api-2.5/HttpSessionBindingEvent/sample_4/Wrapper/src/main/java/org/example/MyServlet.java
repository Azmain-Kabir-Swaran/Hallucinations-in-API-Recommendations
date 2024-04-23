package org.example;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionBindingListener;

public class MyServlet extends HttpServlet {
    public class MySessionBindingListener implements HttpSessionBindingListener {

        @Override
        public void valueBound(HttpSessionBindingEvent event) {
            // This code is executed when a new attribute is added to the session.
            System.out.println("New attribute bound to session: " + event.getName());
        }

        @Override
        public void valueUnbound(HttpSessionBindingEvent event) {
            // This code is executed when an attribute is removed from the session.
            System.out.println("Attribute removed from session: " + event.getName());
        }
    }
}