package org.example;


import java.io.IOException;
import javax.servlet.ServletException;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

public class Main implements org.eclipse.jetty.server.Handler {

    public static void main(String[] args) throws Exception {

        Server server = new Server(8080);
        server.setHandler(new Main());

        server.start();
        server.join();
    }

    @Override
    public void handle(String target, org.eclipse.jetty.server.Request baseRequest,
        org.eclipse.jetty.server.HttpServletRequest request, org.eclipse.jetty.server.HttpServletResponse response)
        throws IOException, ServletException {
        
        // implement the handler logic here
        
        baseRequest.setHandled(true);
    }
}