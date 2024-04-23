package org.example;


import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

public class Main implements ServletRequestEvent {

    private ServletContext context;

    public void init(ServletRequestEvent sre) {
        this.context = sre.getServletContext();
    }

    public void requestInitialized(ServletRequestEvent sre) {
        HttpSession session = sre.getSession();
        if (session != null) {
            try {
                // Some operations using the session
                Object attributeValue = session.getAttribute("attributeName");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void requestDestroyed(ServletRequestEvent sre) {
        // Some operations upon request destroy
    }

    public static void main(String[] args) {
        // Some operations with the ServletContext
    }
}