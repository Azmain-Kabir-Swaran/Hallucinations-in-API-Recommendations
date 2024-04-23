package org.example;


import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class Main extends HttpServlet implements HttpSessionBindingListener {
    private String name;

    public Main(String name) {
        this.name = name;
    }

    // Implemented method of HttpSessionBindingListener
    public void valueBound(HttpSessionBindingEvent event) {
        HttpSession session = event.getSession();
        System.out.println("Session attribute '" + name + "' has been added to session with ID: " + session.getId());
    }

    // Implemented method of HttpSessionBindingListener
    public void valueUnbound(HttpSessionBindingEvent event) {
        HttpSession session = event.getSession();
        System.out.println("Session attribute '" + name + "' has been removed from session with ID: " + session.getId());
    }

    public static void main(String[] args) {
        HttpSession session = new Main("myAttribute");
        session.setAttribute("myAttribute", new Main("myAttribute"));
        session.removeAttribute("myAttribute");
    }
}