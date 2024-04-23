package org.example;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        try {
            resp.getWriter().println("Hello World");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}