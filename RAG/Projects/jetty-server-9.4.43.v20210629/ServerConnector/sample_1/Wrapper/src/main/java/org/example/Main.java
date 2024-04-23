package org.example;


import java.io.IOException;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class Main extends AbstractHandler
{
    private final Server server = new Server();
    private final ServerConnector connector = new ServerConnector(server);

    public static void main(String[] args) throws Exception
    {
        Main main = new Main();
        main.server.addConnector(main.connector);
        main.server.setHandler(main);

        main.server.start();
        main.server.join();
    }

    @Override
    public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response)
            throws IOException
    {
        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        baseRequest.setHandled(true);
        response.getWriter().write("<h1>Hello World</h1>");
    }
}