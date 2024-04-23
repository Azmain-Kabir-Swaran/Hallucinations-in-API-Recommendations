package org.example;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHolder;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.httpHttpServletResponse;

public class Main extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpHttpServletResponse resp) {
        resp.setStatus(HttpServletResponse.SC_OK);
        resp.setContentType("text/html");
        resp.getWriter().print("Hello Jetty");
    }

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        ServletHolder servletHolder = new ServletHolder(Main.class);

        server.setHandler(new ServletContextHandler() {
            {
                addServlet(servletHolder, "/");
            }
        });

        server.start();
        server.join();
    }
}