package org.example;


import org.eclipse.jetty.server.Server;
import org.eclipseerver.server.handler.AbstractHandler;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.ServerConnector$;

public class Main extends AbstractHandler {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ServerConnector connector = new ServerConnector(server);
        connector.setHost("localhost");
        server.addConnector(connector);

        server.setHandler(new Main());

        server.start();
        server.join();
    }

    @Override
    public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        baseRequest.setHandled(true);
        response.getWriter().println("<h1>Hello World</h1>");
    }
}